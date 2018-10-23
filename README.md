### Project Details 
- **Task:** Build Rock-Paper-Scissors  game 
- **Programing language:** java 
- **Test framework:** JUnit 4.12
- **IDE:** Eclipse, Version: Oxygen.2 Release (4.7.2)
- **The build tool:** Maven 
- **Dependency injection (DI) framework:** Spring-boot 
- **Design:** SOLID Design Principles

### Running instructions
1.Download the GitHub project , and  import it as  an Existing Maven project 

2.Run the project as a spring-boot-app by Runing the  main method of `TyntecTestApplication.java` class 
### Test instructions

I've done  2 JUnit test: 

1. `RulesTest.java `  =>  Test Rock-Paper-Scissors game rules 
      - Scissors beats Paper
      - Rock beat Scissors
      - Paper beats Rock
      - If both players choose the same, the round is counted as a tie.
2. `StrategiesTest.java` => Test  PlayerA and  PlayerB   strategies .

### Design Advantages 
- Avoiding  tightly coupled code and  write "Good  code" that is loosely coupled  
- Using open/closed principle ( the project (classes, modules, functions, etc.) should be open for extension, but closed for modification)
- Using  Dependency inversion principle (By adopting  the dependency injection framework spring-boot )
- Utilize Slf4j logging framework by create `Aiesec_tyntec.log that contains the logs of `com.aiesec.tyntec ` package 
- Ability to reuse game code for 2 player games(chess game,XO game .... ) 
- Using the single responsibility principle  (Every class  have  only one responsibility/task)

### Design Disadvantages

- Much classes,packages  and  interfaces 
- Some test are absent  

#### Project Structure

![projectstructure](https://user-images.githubusercontent.com/42076893/47383845-e0230580-d705-11e8-9db7-e830dbdb9e0a.png)


#### Project Execution result

![consoleexecution](https://user-images.githubusercontent.com/42076893/47383904-fe890100-d705-11e8-8846-c3cae3e97bf1.png)
