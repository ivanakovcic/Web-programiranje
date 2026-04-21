@Entity
public class Statistics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Game game;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
}