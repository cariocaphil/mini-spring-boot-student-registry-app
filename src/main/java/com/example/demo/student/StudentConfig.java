public class StudentConfig {

  @Bean
  CommandLineRunner commandLineRunner(StudentRepository repository) {
    return args -> {
      Student mariam = new Student(
          "Mariam",
          "mariam.jamal@gmail.com",
          LocalDate.of(2000, Month.JANUARY, 5),
          21);
      Student alex = new Student(
          "Alex",
          "alex@gmail.com",
          LocalDate.of(2000, Month.JANUARY, 5),
          21);

      repository.saveAll(List.of(mariam, alex));
    }
  }
}