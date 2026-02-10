package ca.bcit.comp2522.bookstore;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Name nameGeorgeOrwell = new Name("George", "Orwell");
        Date birthOrwell = new Date(1903, 6, 25);
        Date deathOrwell = new Date(1950, 1, 21);

        Name nameHarperLee = new Name("Harper", "Lee");
        Date birthLee = new Date(1926, 4, 28);
        Date deathLee = new Date(2016, 2, 19);

        Name nameJaneAusten = new Name("Jane", "Austen");
        //date class does not support years before 1800.
        Date birthAusten = new Date(1800, 12, 16);
        Date deathAusten = new Date(1817, 7, 18);

        Name nameScottFitzgerald = new Name("F. Scott", "Fitzgerald");
        Date birthFitzgerald = new Date(1896, 9, 24);
        Date deathFitzgerald = new Date(1940, 12, 21);

        Name nameHermanMelville = new Name("Herman", "Melville");
        Date birthMelville = new Date(1819, 8, 1);
        Date deathMelville = new Date(1891, 9, 28);

        Name nameRobertCaro = new Name("Robert", "Caro");
        Date birthCaro = new Date(1935, 10, 30);

        Name nameRobertMoses = new Name("Robert", "Moses");
        Date birthMoses = new Date(1888, 12, 18);
        Date deathMoses = new Date(1981, 7, 29);

        Name nameWalterIsaacson = new Name("Walter", "Isaacson");
        Date birthIsaacson = new Date(1952, 5, 20);

        Name nameSteveJobs = new Name("Steve", "Jobs");
        Date birthJobs = new Date(1955, 2, 24);
        Date deathJobs = new Date(2011, 10, 5);

        Name nameMartinGilbert = new Name("Martin", "Gilbert");
        Date birthGilbert = new Date(1936, 10, 25);
        Date deathGilbert = new Date(2015, 2, 3);

        Name nameWinstonChurchill = new Name("Winston", "Churchill");
        Date birthChurchill = new Date(1874, 11, 30);
        Date deathChurchill = new Date(1965, 1, 24);

        Name nameRonChernow = new Name("Ron", "Chernow");
        Date birthChernow = new Date(1949, 3, 3);

        Name nameAlexanderHamilton = new Name("Alexander", "Hamilton");
        //Date class does not support dates before feb 23rd 1800. data has been modified to account for this.
        Date birthHamilton = new Date(1801, 1, 11);
        Date deathHamilton = new Date(1804, 7, 12);

        Name nameAlbertEinstein = new Name("Albert", "Einstein");
        Date birthEinstein = new Date(1879, 3, 14);
        Date deathEinstein = new Date(1955, 4, 18);

        Name nameAnneFrank = new Name("Anne", "Frank");
        Date birthFrank = new Date(1929, 6, 12);
        Date deathFrank = new Date(1945, 2, 1);

        Name nameNelsonMandela = new Name("Nelson", "Mandela");
        Date birthMandela = new Date(1918, 7, 18);
        Date deathMandela = new Date(2013, 12, 5);

        Name nameMahatmaGandhi = new Name("Mahatma", "Gandhi");
        Date birthGandhi = new Date(1869, 10, 2);
        Date deathGandhi = new Date(1948, 1, 30);

        Name nameMayaAngelou = new Name("Maya", "Angelou");
        Date birthAngelou = new Date(1928, 4, 4);
        Date deathAngelou = new Date(2014, 5, 28);

        Name nameMalcolmX = new Name("Malcolm", "X");
        Date birthMalcolmX = new Date(1925, 5, 19);
        Date deathMalcolmX = new Date(1965, 2, 21);

        Author authorOrwell = new Author(nameGeorgeOrwell, birthOrwell, deathOrwell, "Dystopian Fiction");
        Author authorLee = new Author(nameHarperLee, birthLee, deathLee, "Southern Gothic");
        Author authorAusten = new Author(nameJaneAusten, birthAusten, deathAusten, "Classic Romance");
        Author authorFitzgerald = new Author(nameScottFitzgerald, birthFitzgerald, deathFitzgerald, "Modernism");
        Author authorMelville = new Author(nameHermanMelville, birthMelville, deathMelville, "Adventure");

        Author authorCaro = new Author(nameRobertCaro, birthCaro, null, "Political Biography");
        Person subjectMoses = new Person(nameRobertMoses, birthMoses, deathMoses);

        Author authorIsaacson = new Author(nameWalterIsaacson, birthIsaacson, null, "Biography");
        Person subjectJobs = new Person(nameSteveJobs, birthJobs, deathJobs);

        Author authorGilbert = new Author(nameMartinGilbert, birthGilbert, deathGilbert, "History");
        Person subjectChurchill = new Person(nameWinstonChurchill, birthChurchill, deathChurchill);

        Author authorChernow = new Author(nameRonChernow, birthChernow, null, "History");
        Person subjectHamilton = new Person(nameAlexanderHamilton, birthHamilton, deathHamilton);

        Person subjectEinstein = new Person(nameAlbertEinstein, birthEinstein, deathEinstein);

        Author authorFrank = new Author(nameAnneFrank, birthFrank, deathFrank, "Autobiography");
        Author authorMandela = new Author(nameNelsonMandela, birthMandela, deathMandela, "Memoir");
        Author authorGandhi = new Author(nameMahatmaGandhi, birthGandhi, deathGandhi, "Memoir");
        Author authorAngelou = new Author(nameMayaAngelou, birthAngelou, deathAngelou, "Autobiographical Fiction");
        Author authorMalcolmX = new Author(nameMalcolmX, birthMalcolmX, deathMalcolmX, "Memoir");

        Book book1984 = new Book("1984", 1949, authorOrwell);
        Book bookToKillAMockingbird = new Book("To Kill a Mockingbird", 1960, authorLee);
        Book bookPrideAndPrejudice = new Book("Pride and Prejudice", 1813, authorAusten);
        Book bookGreatGatsby = new Book("The Great Gatsby", 1925, authorFitzgerald);
        Book bookMobyDick = new Book("Moby-Dick", 1851, authorMelville);

        Biography bioPowerBroker = new Biography("The Power Broker", 1974, authorCaro, subjectMoses);
        Biography bioSteveJobs = new Biography("Steve Jobs", 2011, authorIsaacson, subjectJobs);
        Biography bioChurchill = new Biography("Churchill: A Life", 1991, authorGilbert, subjectChurchill);
        Biography bioHamilton = new Biography("Alexander Hamilton", 2004, authorChernow, subjectHamilton);
        Biography bioEinstein = new Biography("Einstein: His Life and Universe", 2007, authorIsaacson, subjectEinstein);

        Autobiography autoAnneFrank = new Autobiography("The Diary of a Young Girl", 1947, authorFrank);
        Autobiography autoMandela = new Autobiography("Long Walk to Freedom", 1994, authorMandela);
        Autobiography autoGandhi = new Autobiography("The Story of My Experiments with Truth", 1927, authorGandhi);
        Autobiography autoAngelou = new Autobiography("I Know Why the Caged Bird Sings", 1969, authorAngelou);
        Autobiography autoMalcolmX = new Autobiography("Autobiography of Malcolm X", 1965, authorMalcolmX);

        book1984.backward();
        bookToKillAMockingbird.backward();
        bookPrideAndPrejudice.backward();
        bookGreatGatsby.backward();
        bookMobyDick.backward();

        bioPowerBroker.backward();
        bioSteveJobs.backward();
        bioChurchill.backward();
        bioHamilton.backward();
        bioEinstein.backward();

        autoAnneFrank.backward();
        autoMandela.backward();
        autoGandhi.backward();
        autoAngelou.backward();
        autoMalcolmX.backward();

        book1984.display();
        bookToKillAMockingbird.display();
        bookPrideAndPrejudice.display();
        bookGreatGatsby.display();
        bookMobyDick.display();

        bioPowerBroker.display();
        bioSteveJobs.display();
        bioChurchill.display();
        bioHamilton.display();
        bioEinstein.display();

        autoAnneFrank.display();
        autoMandela.display();
        autoGandhi.display();
        autoAngelou.display();
        autoMalcolmX.display();

        int result1 = book1984.compareTo(bookMobyDick);
        System.out.println("Result of book1984.compareTo(bookMobyDick): " + result1);

        int result2 = bookPrideAndPrejudice.compareTo(bookGreatGatsby);
        System.out.println("Result of bookPrideAndPrejudice.compareTo(bookGreatGatsby): " + result2);

        boolean isEqual = bookToKillAMockingbird.equals(book1984);
        System.out.println("Does To Kill a Mockingbird equal 1984? " + isEqual);

        int bioCompare = bioSteveJobs.compareTo(bioEinstein);
        System.out.println("Comparison of Steve Jobs vs Einstein bios: " + bioCompare);

        int authorCompare = authorCaro.compareTo(authorIsaacson);
        System.out.println("Comparison of Author Caro vs Author Isaacson: " + authorCompare);

        boolean sameAuthor = authorIsaacson.equals(bioEinstein.getAuthor());
        System.out.println("Are the authors of Jobs and Einstein bios the same? " + sameAuthor);
    }
}