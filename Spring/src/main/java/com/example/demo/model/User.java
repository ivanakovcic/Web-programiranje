@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;
    private String firstName;
    private String lastName;
    private String role; // "USER" ili "ADMIN"
    private boolean blocked = false;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Statistics> stats = new HashSet<>();

    // Getteri i Setteri...
}