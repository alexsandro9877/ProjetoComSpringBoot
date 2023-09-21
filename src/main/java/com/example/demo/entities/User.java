package com.example.demo.entities;
import javax.persistence.*;

@Entity
@Table(name = "tb_user")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private String email;

/// Pegando o valor da primari key da tabela usuario para a tabela departamente
@ManyToOne
@JoinColumn(name = "department_id") /// configurando a chafe estrangeira
private Department department;
/// um objeto ligado a outro
/// Associação entre entidades Usuario e Department
public User() {

}
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


}
