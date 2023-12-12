package mr.iscae.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false,name = "name")
    private String name;
    @Column(unique = true)
    private String phone;
    @Column(unique = true)
    private String website;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Server> servers=new ArrayList<>();
}
