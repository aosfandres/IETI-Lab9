package eci.ieti;
import eci.ieti.data.TodoRepository;
import eci.ieti.data.UserRepository;

import eci.ieti.data.model.Todo;
import eci.ieti.data.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

  /*   @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;
 */
    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

     /*    customerRepository.deleteAll();

        customerRepository.save(new Customer("Alice", "Smith"));
        customerRepository.save(new Customer("Bob", "Marley"));
        customerRepository.save(new Customer("Jimmy", "Page"));
        customerRepository.save(new Customer("Freddy", "Mercury"));
        customerRepository.save(new Customer("Michael", "Jackson"));

        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");

        customerRepository.findAll().stream().forEach(System.out::println);
        System.out.println();

        productRepository.deleteAll();

        productRepository.save(new Product(1L, "Samsung S8", "All new mobile phone Samsung S8"));
        productRepository.save(new Product(2L, "Samsung S8 plus", "All new mobile phone Samsung S8 plus"));
        productRepository.save(new Product(3L, "Samsung S9", "All new mobile phone Samsung S9"));
        productRepository.save(new Product(4L, "Samsung S9 plus", "All new mobile phone Samsung S9 plus"));
        productRepository.save(new Product(5L, "Samsung S10", "All new mobile phone Samsung S10"));
        productRepository.save(new Product(6L, "Samsung S10 plus", "All new mobile phone Samsung S10 plus"));
        productRepository.save(new Product(7L, "Samsung S20", "All new mobile phone Samsung S20"));
        productRepository.save(new Product(8L, "Samsung S20 plus", "All new mobile phone Samsung S20 plus"));
        productRepository.save(new Product(9L, "Samsung S20 ultra", "All new mobile phone Samsung S20 ultra"));

        System.out.println("Paginated search of products by criteria:");
        System.out.println("-------------------------------");

        productRepository.findByDescriptionContaining("plus", PageRequest.of(0, 2)).stream()
                .forEach(System.out::println);

        System.out.println();
 */
/*        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Mon goOperations mongoOperation = (MongoOperations) applicationContext.getBean("mongoTemplate"); */

        userRepository.deleteAll();
        todoRepository.deleteAll();

        String[] users= {"andres","leo","maria","rodri","cris","mao","tefa","luz","liz","mia"};

        for (int i = 0; i < 10; ++i) {
            userRepository.save(new User(users[i],users[i]+"@mail.com"));
        }

        todoRepository.save(new Todo("travel to Galapagos",10, new Date(System.currentTimeMillis()+1000000000),"charles@natural.com","pending"));
        todoRepository.save(new Todo("travel to Malvinas",4,new Date(System.currentTimeMillis()-1000000000),"charles@natural.com","pending"));
        todoRepository.save(new Todo("go to Galapagos",7,new Date(System.currentTimeMillis()+1000000000),"christobal@natural.com","pending"));
        todoRepository.save(new Todo("go to Malvinas",9,new Date(System.currentTimeMillis()-1000000000),"charles@natural.com","pending"));
        todoRepository.save(new Todo("travel to Bermudas",3,new Date(System.currentTimeMillis()+1000000000),"charles@natural.com","pending"));
        todoRepository.save(new Todo("Read Galapagos",10,new Date(System.currentTimeMillis()-1000000000),"Darwin@natural.com","pending"));
        todoRepository.save(new Todo("Write to Malvinas",4,new Date(System.currentTimeMillis()+1000000000),"Darwin@natural.com","pending"));
        todoRepository.save(new Todo("Read book Galapagos",7,new Date(System.currentTimeMillis()-1000000000),"christobal@natural.com","pending"));
        todoRepository.save(new Todo("Write book Malvinas",9,new Date(System.currentTimeMillis()+1000000000),"Darwin@natural.com","pending"));
        todoRepository.save(new Todo("Discover Bermudas",3,new Date(System.currentTimeMillis()+1000000000),"Darwin@natural.com","pending"));
        todoRepository.save(new Todo("Find Galapagos",1,new Date(System.currentTimeMillis()-1000000000),"Darwin@natural.com","pending"));
        todoRepository.save(new Todo("Find Malvinas",2,new Date(System.currentTimeMillis()+1000000000),"charles@natural.com","pending"));
        todoRepository.save(new Todo("Draw Galapagos",3,new Date(System.currentTimeMillis()-1000000000),"Darwin@natural.com","pending"));
        todoRepository.save(new Todo("Draw Malvinas",4,new Date(System.currentTimeMillis()+1000000000),"charles@natural.com","pending"));
        todoRepository.save(new Todo("Paint Bermudas",5,new Date(System.currentTimeMillis()-1000000000),"Darwin@natural.com","pending"));
        todoRepository.save(new Todo("Paint Galapagos",6,new Date(System.currentTimeMillis()+1000000000),"Darwin@natural.com","pending"));
        todoRepository.save(new Todo("Paint Malvinas",7,new Date(System.currentTimeMillis()-1000000000),"Darwin@natural.com","pending"));
        todoRepository.save(new Todo("Share Galapagos",8,new Date(System.currentTimeMillis()+1000000000),"christobal@natural.com","pending"));
        todoRepository.save(new Todo("Share Malvinas",9,new Date(System.currentTimeMillis()-1000000000),"charles@natural.com","pending"));
        todoRepository.save(new Todo("Share travel to Bermudas",10,new Date(System.currentTimeMillis()+1000000000),"Darwin@natural.com","pending"));
        todoRepository.save(new Todo("Share travel to Galapagos",10,new Date(System.currentTimeMillis()+1000000000),"Darwin@natural.com","pending"));
        todoRepository.save(new Todo("Share travel to Malvinas",4,new Date(System.currentTimeMillis()-1000000000),"charles@natural.com","pending"));
        todoRepository.save(new Todo("Go back Galapagos",7,new Date(System.currentTimeMillis()+1000000000),"Darwin@natural.com","pending"));
        todoRepository.save(new Todo("Go back Malvinas",9,new Date(System.currentTimeMillis()-1000000000),"charles@natural.com","pending"));
        todoRepository.save(new Todo("Go back Bermudas and Go back Malvinas and share it",3,new Date(System.currentTimeMillis()+1000000000),"charles@Darwin.com","pending"));

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        MongoOperations mongoOperation = (MongoOperations) applicationContext.getBean("mongoTemplate");


        // 1
        Query query = new Query();
        query.addCriteria(Criteria.where("dueDate").lt(new Date()));
        List<Todo> todos1 = mongoOperation.find(query, Todo.class);
        System.out.println("First:");
        System.out.println("Query: "+query.toString());
        System.out.println("-------------------------------");
        for (Todo todo : todos1) {
            System.out.println(todo.toString());
        }
        System.out.println();

        //2
        query = new Query();
        query.addCriteria(Criteria.where("responsible").is("Darwin@natural.com").and("priority").gt(4));
        List<Todo> todos = mongoOperation.find(query, Todo.class);
        System.out.println("Second");
        System.out.println("Query: "+query.toString());
        System.out.println("-------------------------------");
        for (Todo todo : todos) {
            System.out.println(todo.toString());
        }
        System.out.println();

        //3
        query = new Query();
        List<User> userss = mongoOperation.find(query, User.class);
        Query queryAllTodos = new Query();
        List<Todo> allTodos = mongoOperation.find(queryAllTodos, Todo.class);
        List<User> listWhitMoreThan2Todos = new ArrayList<>();
        for (User user : userss) {
            int count = 0;
            for (Todo todo : allTodos) {
                if (todo.getResponsible().equals(user.getEmail())){
                    count += 1;
                }
            }
            if (count>2){
                listWhitMoreThan2Todos.add(user);
            }
        }
        System.out.println("Third");
        System.out.println("-------------------------------");
        for (User user : listWhitMoreThan2Todos) {
            System.out.println(user.toString());
        }
        System.out.println();

        //4
        query = new Query();
        query.addCriteria(Criteria.where("description").regex("[a-z,A-Z,0-9, ' ', ]{30,}"));
        List<Todo> largeDescription = mongoOperation.find(query, Todo.class);
        System.out.println("Fourth");
        System.out.println("Query: "+query.toString());
        System.out.println("-------------------------------");
        for (Todo todo : largeDescription) {
            System.out.println(todo.toString());
        }
        System.out.println();

    }



    

}