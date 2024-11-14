import config.Database;
import repositories.TodoListRepository;
import repositories.TodoListRepositoryDblmpl;
import repositories.TodoListRepositoryImpl;
import services.TodoListService;
import services.TodoListServiceImpl;
import views.TodoListTerminalView;
import views.TodoListView;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database database = new Database("my_database", "root","","localhost","3306");
        database.setup();


        TodoListRepositoryDblmpl todoListRepository = new TodoListRepositoryDblmpl(database);
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListTerminalView(todoListService);
        todoListView.run();
    }
}