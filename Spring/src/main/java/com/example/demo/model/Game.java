@Entity
public class Game implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String url; // Putanja za iframe
    private String thumbnailUrl;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "game")
    private Set<Statistics> stats = new HashSet<>();

    // Getteri i Setteri...
}