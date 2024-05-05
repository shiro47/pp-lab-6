## Ćwiczenia

### Zadanie 1 (branch - zad1)
W ramach zadania 1, wykonaj następujące kroki:
- utwórz katalog `company` a w nim:
  - utwórz katalog `interfaces` a w nim:
    - utwórz plik `Employable.java`,
    - zdefiniuj w nim publiczny interfejs o nazwie `Employable`,
    - zdefiniuj w tym interfejsie jedynie metodę `work()`, zwracającą typ `void`.
  - utwórz katalog `abstracts` a w nim:
    - utwórz plik `Employee.java`,
    - zdefiniuj w nim abstrakcyjną klasę o nazwie `Employee`, implementującą interfejs `Employable`,
    - klasa ta, zawiera trzy pola prywatne, `name` (`String`), `salary` (`double`) oraz `id` (`int`),
    - konstruktor tej klasy przyjmuje te wartości i przypisuje do wspomnianych pól,
    - klasa ta, zawiera publiczną metodę `getName` zwracającą `name`,
    - klasa ta, zawiera publiczną metodę `getSalary` zwracającą `salary`.
  - utwórz katalog `models` a w nim:
    - utwórz plik `Manager.java`,
    - zdefiniuj w nim klasę o nazwie `Manager` dziedziczącą po klasie abstrakcyjnej `Employee`,
    - klasa ta, zawiera metodę `work`, która zwraca do konsoli wiadomość „Manager {{NAME}} is managing…”,
    - utwórz plik `Worker.java`,
    - zdefiniuj w nim klasę finalną o nazwie `Worker` dziedziczącą po klasie abstrakcyjnej `Employee`,
    - klasa ta, zawiera metodę `work`, która zwraca do konsoli wiadomość „Worker {{NAME}} is working…”.
- utwórz poza pakietem `company` (na najwyższym poziomie w strukturze aplikacji) plik `Main.java`, implementujący metodę `main` a w niej:
  - utwórz cztery instancje klasy `Worker`,
  - utwórz jedną instancję klasy `Manager`,
  - wyświetl `salary` oraz wywołaj metodę `work` dla każdego z tych obiektów.

### Zadanie 2 (branch – zad2)
W ramach zadania 2, kontynuuj na osobnym branchu, rozwijanie kodu napisanego w poprzedniemu zadaniu i wykonaj następujące kroki:
- zmodyfikuj plik `Employee.java` w następujący sposób:
  - dodaj pola prywatne `hireDate` (`String`) oraz `position` (`String`),
  - dodaj metodę publiczną `getHireDate` zwracającą `hireDate`,
  - dodaj metodę publiczną `getPosition` zwracającą `position`,
  - dodaj metodę publiczną `hashCode`, która zwraca `id`,
- Zmodyfikuj plik `Main.java` w następujący sposób:
  - zmodyfikuj instancje `Worker` oraz `Manager` o brakujące dane,
  - utwórz listę typu `Employee` o nazwie `employees` (wykorzystaj `ArrayList`) a następnie, dodaj do niej wszystkie instancje klas `Manager` oraz `Worker`,
  - usuń fragment kodu odpowiadający za wywołanie `getSalary` oraz `work`,
  - utwórz pętlę iterującą po liście `employees` i wywołującą w każdej iteracji `work` dla aktualnie dostępnego pracownika oraz wyświetli w konsoli „- {{NAME}} (ID: {{ID}}, Position: {{POSITION}}, Hire date: {{HIRE_DATE}}, Salary: {{SALARY}}.

### Zadanie 3 (branch – zad3)
W ramach zadania 3, kontynuuj na osobnym branchu, rozwijanie kodu napisanego w poprzedniemu zadaniu i wykonaj następujące kroki:
- zmodyfikuj plik `Employee.java` w następujący sposób:
  - dodaj metodę publiczną `equals`, która przyjmuje jako argument `obj` (`Object`) i:
    - zwraca `false`, gdy porównywany obiekt jest równy `null` lub nie jest tą samą instancją,
    - zwraca `true`, gdy porównywany obiekt jest równy instancji wywołującej metodę `equals` lub gdy `id` obu obiektów jest takie samo.
- Zmodyfikuj plik `Main.java` w następujący sposób:
  - utwórz trzy instancje klasy `Worker` (niech dwie z nich mają ten sam `id`),
  - utwórz jedną instancję klasy `Manager`,
  - dla utworzonych w tym zadaniu instancji, wywołaj metodę `hashCode` i wyświetl wynik jej działania w terminalu w następującej postaci „{{NAME}} has code: {{ID}}”,
  - dla jednej z instancji klasy `Worker` z powtarzającym się `id` wywołaj metodę `equals` porównując go ze wszystkimi utworzonymi w tym zadaniu obiektami (jednym `Manager` oraz pozostałymi dwoma `Worker`).

### Zadanie 4 (branch – zad4)
W ramach zadania 4, kontynuuj na osobnym branchu, rozwijanie kodu napisanego w poprzedniemu zadaniu, zmodyfikuj kod w metodzie `main` i wykonaj następujące kroki:
- zmodyfikuj plik `Main.java` w następujący sposób:
  - dodaj utworzone wcześniej (zad3) instancje obiektów do listy `employees`,
  - zaimplementuj mechanizm/mechanizmy, które:
    - zliczą całkowitą sumę pensji wszystkich pracowników,
    - zliczą całkowitą sumę pensji wszystkich `Manager`,
    - zliczą całkowitą sumę pensji wszystkich `Worker`,
    - wyświetla w terminalu informacji o tych kwotach,
    - będzie wyszukiwał wszystkie instancje obiektu, które mają swój odpowiednik w kolekcji (posiadają to samo `id`),
  - na potrzeby tego zadania, dodaj kolejne dwie instancje `Worker` oraz `Manager` i zmień `id` tak, by co najmniej trzy elementy kolekcji miały swój odpowiednik w niej (posiadają to samo `id`).
