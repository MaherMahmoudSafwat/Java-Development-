import org.w3c.dom.css.Counter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class GeneralQuiz implements Utility
{
    private Scanner Input = new Scanner(System.in);
    private ArrayList<String>IsQuestionHasBeenAskedBefore = new ArrayList<String>();
    private int AnswersCounter = 0;
    private String[] ArrayOfQuestions = {
    "What is the largest planet in our solar system? Jupiter",
            "Who Built The Pyramids? Egyptians",
            "What is the chemical symbol for gold? Au",
            "In what year did World War II begin? 1939",
            "Who painted the Mona Lisa? Leonardo da Vinci",
            "What is the capital of France? Paris",
            "How many continents are there? Seven",
            "What is the tallest mountain in the world? Mount Everest",
            "What is the largest ocean on Earth? Pacific Ocean",
            "Who wrote \"Hamlet\"? William Shakespeare",
            "What is the smallest country in the world? Vatican City",
            "What is the name of the Earth's only natural satellite? The Moon",
            "How many teeth does an adult human typically have? 32",
            "What is the chemical formula for water? H₂O",
            "Who was the first president of the United States? George Washington",
            "What is the currency of Japan? Yen",
            "What is the name of the longest river in the world? Nile River",
            "What is the name of the company founded by Steve Jobs and Steve Wozniak? Apple",
            "What is the largest desert in the world (excluding polar deserts)? Sahara Desert",
            "What is the name of the force that keeps objects from floating away from Earth? Gravity",
            "How many years are there in a century? 100",
            "What is the name of the closest star to Earth (other than the Sun)? Proxima Centauri",
            "What is the name of the process by which plants make their own food? Photosynthesis",
            "What is the name of the largest organ in the human body? Skin",
            "What is the name of the Roman Colosseum's original name? Flavian Amphitheatre",
            "What is the capital of Australia? Canberra",
            "What is the name of the sea that separates the UK from continental Europe? The English Channel",
            "What is the name of the theory that explains the origin of the universe? The Big Bang Theory",
            "What is the name of the device used to measure earthquakes? Seismograph",
            "What is the name of the element that makes up the majority of the Sun? Hydrogen",
            "What is the name of the process by which a caterpillar transforms into a butterfly? Metamorphosis",
            "What is the name of the disease caused by a deficiency of vitamin C? Scurvy",
            "What is the name of the war fought between the North and South regions of the United States? The American Civil War",
            "What is the name of the famous detective created by Sir Arthur Conan Doyle? Sherlock Holmes",
            "What is the name of the country that gifted the Statue of Liberty to the United States? France",
            "What is the name of the famous scientist who developed the theory of relativity? Albert Einstein",
            "What is the name of the largest rainforest in the world? Amazon Rainforest",
            "What is the name of the currency used in the European Union? Euro",
            "What is the name of the traditional Japanese art of paper folding? Origami",
            "What is the name of the Greek god of the sea? Poseidon",
            "What is the name of the Indian spiritual teacher who popularized yoga in the West? Swami Vivekananda",
            "What is the name of the Spanish painter who painted \"Guernica\"? Pablo Picasso",
            "What is the name of the American inventor who invented the light bulb? Thomas Edison",
            "What is the name of the Italian city known for its canals? Venice",
            "What is the name of the author who wrote \"Pride and Prejudice\"? Jane Austen",
            "What is the name of the technology company founded by Bill Gates? Microsoft",
            "What is the name of the social media platform founded by Mark Zuckerberg? Facebook",
            "What is the name of the video sharing platform founded by three former PayPal employees? YouTube",
            "What is the name of the search engine company founded by Larry Page and Sergey Brin? Google",
            "What is the name of the electric car company founded by Elon Musk? Tesla"
    };
    private String [][] questionChoices = {
            {"Mars", "Venus", "Earth", "Saturn", "Jupiter", "Neptune", "Uranus", "Mercury", "Pluto", "Ganymede"}, // Largest planet
            {"Egyptians", "Aliens", "Greek", "Roman", "Incan", "Mayan", "Aztec", "Chinese", "Indian", "Nubian"}, // Who built the pyramids? (Nationalities)
            {"Ag", "Fe", "Cu", "Sn", "Au", "Pb", "Hg", "Zn", "K", "Ca"}, // Chemical symbol for gold
            {"1914", "1929", "1935", "1937", "1939", "1940", "1941", "1942", "1945", "1943"}, // WWII start year
            {"Michelangelo", "Raphael", "Donatello", "Titian", "Leonardo da Vinci", "Rembrandt", "Van Gogh", "Monet", "Picasso", "Botticelli"}, // Mona Lisa painter
            {"Berlin", "Rome", "Madrid", "London", "Paris", "Amsterdam", "Vienna", "Lisbon", "Dublin", "Oslo"}, // Capital of France
            {"Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen"}, // Number of continents
            {"K2", "Kangchenjunga", "Lhotse", "Makalu", "Mount Everest", "Cho Oyu", "Dhaulagiri", "Manaslu", "Nanga Parbat", "Annapurna"}, // Tallest mountain
            {"Atlantic", "Indian", "Arctic", "Southern", "Pacific Ocean", "Caribbean", "Mediterranean", "Baltic", "North Sea", "Red Sea"}, // Largest ocean
            {"Charles Dickens", "Jane Austen", "Mark Twain", "Leo Tolstoy", "William Shakespeare", "George Orwell", "Ernest Hemingway", "F. Scott Fitzgerald", "Virginia Woolf", "Emily Brontë"}, // Hamlet author
            {"Monaco", "Nauru", "Tuvalu", "San Marino", "Vatican City", "Liechtenstein", "Andorra", "Malta", "Seychelles", "Palau"}, // Smallest country
            {"Mars", "Venus", "Jupiter", "Saturn", "The Moon", "Neptune", "Uranus", "Mercury", "Pluto", "Io"}, // Earth's satellite
            {"28", "30", "32", "34", "36", "26", "38", "24", "40", "42"}, // Adult teeth
            {"CO2", "NaCl", "CH4", "NH3", "H₂O", "O2", "N2", "HCl", "SO2", "H₂S"}, // Chemical formula for water
            {"John Adams", "Thomas Jefferson", "Abraham Lincoln", "James Madison", "George Washington", "Benjamin Franklin", "Alexander Hamilton", "John Jay", "James Monroe", "John Quincy Adams"}, // First US president
            {"Won", "Rupee", "Pound", "Dollar", "Yen", "Euro", "Franc", "Real", "Lira", "Krone"}, // Currency of Japan
            {"Amazon", "Congo", "Yangtze", "Mekong", "Nile River", "Mississippi", "Danube", "Rhine", "Volga", "Ganges"}, // Longest river
            {"IBM", "Dell", "HP", "Lenovo", "Apple", "Samsung", "Sony", "LG", "Acer", "Asus"}, // Apple founders' company
            {"Gobi", "Kalahari", "Namib", "Arabian", "Sahara Desert", "Australian", "Chihuahuan", "Sonoran", "Karakum", "Thar"}, // Largest desert
            {"Magnetism", "Electricity", "Nuclear Force", "Weak Force", "Gravity", "Friction", "Buoyancy", "Tension", "Compression", "Shear"}, // Force keeping objects from floating
            {"50", "75", "100", "125", "150", "25", "175", "200", "225", "250"}, // Years in a century
            {"Sirius", "Vega", "Alpha Centauri A", "Barnard's Star", "Proxima Centauri", "Betelgeuse", "Rigel", "Polaris", "Altair", "Deneb"}, // Closest star
            {"Respiration", "Digestion", "Excretion", "Circulation", "Photosynthesis", "Reproduction", "Growth", "Movement", "Sensation", "Metabolism"}, // Plant food process
            {"Heart", "Brain", "Lungs", "Liver", "Skin", "Kidney", "Stomach", "Intestines", "Pancreas", "Spleen"}, // Largest organ
            {"Colosseum", "Pantheon", "Forum", "Palatine Hill", "Flavian Amphitheatre", "Circus Maximus", "Baths of Caracalla", "Trajan's Market", "Castel Sant'Angelo", "Domus Aurea"}, // Colosseum's original name
            {"Sydney", "Melbourne", "Brisbane", "Perth", "Canberra", "Adelaide", "Gold Coast", "Newcastle", "Darwin", "Hobart"}, // Capital of Australia
            {"Irish Sea", "North Sea", "Baltic Sea", "Norwegian Sea", "The English Channel", "Mediterranean Sea", "Adriatic Sea", "Aegean Sea", "Black Sea", "Ionian Sea"}, // Sea separating UK from Europe
            {"Steady State Theory", "Oscillating Universe Theory", "Inflationary Universe Theory", "Multiverse Theory", "The Big Bang Theory", "String Theory", "M-Theory", "Loop Quantum Gravity", "Plasma Cosmology", "Ekpyrotic Universe"}, // Universe origin theory
            {"Thermometer", "Barometer", "Hygrometer", "Anemometer", "Seismograph", "Richter Scale", "Mercalli Scale", "Moment Magnitude Scale", "Tsunami Meter", "Tide Gauge"}, // Device measuring earthquakes
            {"Oxygen", "Nitrogen", "Carbon Dioxide", "Helium", "Hydrogen", "Neon", "Argon", "Krypton", "Xenon", "Radon"}, // Sun's majority element
            {"Gametogenesis", "Fertilization", "Cleavage", "Gastrulation", "Metamorphosis", "Embryonic Development", "Larval Stage", "Pupal Stage", "Adult Stage", "Regeneration"}, // Caterpillar to butterfly
            {"Rickets", "Beriberi", "Pellagra", "Anemia", "Scurvy", "Night Blindness", "Xerophthalmia", "Kwashiorkor", "Marasmus", "Goiter"},  // Vitamin C deficiency disease
            {"World War I", "World War II", "Korean War", "Vietnam War", "The American Civil War", "American Revolutionary War", "Spanish-American War", "Mexican-American War", "Cold War", "Napoleonic Wars"}, // North/South US war
            {"Agatha Christie", "Raymond Chandler", "Dashiell Hammett", "Edgar Allan Poe", "Sherlock Holmes", "Hercule Poirot", "Miss Marple", "Philip Marlowe", "Sam Spade", "Nero Wolfe"}, // Sherlock Holmes creator
            {"Spain", "Italy", "Germany", "Portugal", "France", "Belgium", "Switzerland", "Netherlands", "Luxembourg", "Austria"}, // Statue of Liberty gifter
            {"Isaac Newton", "Galileo Galilei", "Stephen Hawking", "Marie Curie", "Albert Einstein", "Niels Bohr", "Max Planck", "Werner Heisenberg", "Erwin Schrödinger", "Richard Feynman"}, // Relativity theory developer
            {"Congo Rainforest", "Daintree Rainforest", "Tongass National Forest", "Valdivian Temperate Rainforest", "Amazon Rainforest", "Southeast Asian Rainforest", "Central American Rainforest", "African Rainforest", "Indian Rainforest", "Borneo Rainforest"}, // Largest rainforest
            {"Dollar", "Pound", "Yen", "Swiss Franc", "Euro", "Canadian Dollar", "Australian Dollar", "Indian Rupee", "Chinese Yuan", "South Korean Won"}, // EU currency
            {"Ikebana", "Bonsai", "Calligraphy", "Sumie", "Origami", "Kendo", "Judo", "Karate", "Aikido", "Taekwondo"}, // Paper folding art
            {"Zeus", "Hades", "Ares", "Apollo", "Poseidon", "Hermes", "Dionysus", "Hephaestus", "Athena", "Cronus"}, // Greek sea god
            {"Rabindranath Tagore", "Mahatma Gandhi", "Jawaharlal Nehru", "Sardar Vallabhbhai Patel", "Swami Vivekananda", "Indira Gandhi", "Rajendra Prasad", "Morarji Desai", "Lal Bahadur Shastri", "Vinoba Bhave"}, // Yoga popularizer
            {"Salvador Dalí", "Joan Miró", "Francisco Goya", "El Greco", "Pablo Picasso", "Diego Rivera", "Frida Kahlo", "Fernando Botero", "Vincent van Gogh", "Paul Cézanne"}, // "Guernica" painter
            {"Alexander Graham Bell", "Nikola Tesla", "Guglielmo Marconi", "Wright Brothers", "Thomas Edison", "Samuel Morse", "Eli Whitney", "George Washington Carver", "Henry Ford", "Lewis Latimer"}, // Light bulb inventor
            {"Florence", "Milan", "Naples", "Turin", "Venice", "Genoa", "Bologna", "Verona", "Palermo", "Siena"}, // Italian canal city
            {"Charlotte Brontë", "Emily Brontë", "Anne Brontë", "George Eliot", "Jane Austen", "Virginia Woolf", "Emily Dickinson", "Louisa May Alcott", "Margaret Atwood", "Sylvia Plath"}, // "Pride and Prejudice" author
            {"Amazon", "Google", "Apple", "IBM", "Microsoft", "Oracle", "Cisco", "Intel", "Dell", "HP"}, // Bill Gates' company
            {"Instagram", "Twitter", "Snapchat", "LinkedIn", "Facebook", "TikTok", "Pinterest", "Reddit", "Tumblr", "WhatsApp"}, // Mark Zuckerberg's platform
            {"Vimeo", "Dailymotion", "Metacafe", "Veoh", "YouTube", "Twitch", "Flickr", "Vine", "MySpace", "LiveLeak"}, // PayPal founders' platform
            {"Bing", "DuckDuckGo", "Yahoo", "AOL", "Google", "Ask.com", "Ecosia", "Startpage", "Lycos", "Excite"}, // Larry Page & Sergey Brin's company
            {"Rivian", "Lucid", "Fisker", "Nio", "Tesla", "BYD", "XPeng", "Li Auto", "Polestar", "VinFast"} // Elon Musk's electric car company
    };
    public String GetQuestionOnly(String FullQuestion)
    {
        return FullQuestion.substring(0,FullQuestion.indexOf("?")+1);
    }
    public String GetAnswersOnly(String FullQuestion)
    {
        return FullQuestion.substring(FullQuestion.indexOf("?")+2);
    }
    public String GetAnswersOnlyFromArrayOfChoices(String ArrayOfChoices)
    {
        String Answer = "";
        Answer = ArrayOfChoices.substring(ArrayOfChoices.indexOf(" ")+1);
        return Answer;
    }
    public String [] HandleQuestionAnswers(String FullQuestion,int GetRandomQuestion)
    {
        String [] ArrayAnswers = {"A-","B-","C-","D-"};
        boolean Flag = true;
        int GetRandomNumber1 = 0;
        int GetRandomNumber2=0;
        int Counter=0;
        FullQuestion = GetAnswersOnly(FullQuestion);//Tesla
        ArrayList<String>Answers = new ArrayList<>();
        while(Counter <= 3)
        {
            GetRandomNumber1 = (int)(Math.random()*5);
            GetRandomNumber2 = (int)(Math.random()*10);
            if(Answers.contains(questionChoices[GetRandomQuestion][GetRandomNumber2]))
                continue;
            if(GetRandomNumber1==4 && Flag && !Answers.contains(FullQuestion))
            {
                ArrayAnswers[Counter]=ArrayAnswers[Counter]+" " + FullQuestion;
                Counter++;
                Flag= false;
                Answers.add(FullQuestion);
                continue;
            }
            if(Counter==3 && Flag && !Answers.contains(FullQuestion))
            {
                ArrayAnswers[Counter]=ArrayAnswers[Counter]+" " + FullQuestion;
                Counter++;
                Flag= false;
                Answers.add(FullQuestion);
                continue;
            }
            ArrayAnswers[Counter]=ArrayAnswers[Counter] + " " + questionChoices[GetRandomQuestion][GetRandomNumber2];
            Answers.add(questionChoices[GetRandomQuestion][GetRandomNumber2]);
            Counter++;
        }
        return ArrayAnswers;
    }
    public boolean CheckUserAnswer(char UserAnswer, String [] ArrayAnswers, String Answer)
    {
        switch(UserAnswer)
        {
            case 'A':
                if(Answer.equals(GetAnswersOnlyFromArrayOfChoices(ArrayAnswers[0])))
                    return true;
                break;
            case 'B':
                if(Answer.equals(GetAnswersOnlyFromArrayOfChoices(ArrayAnswers[1])))
                    return true;
                break;
            case 'C':
                if(Answer.equals(GetAnswersOnlyFromArrayOfChoices(ArrayAnswers[2])))
                    return true;
                break;
            case 'D':
                if(Answer.equals(GetAnswersOnlyFromArrayOfChoices(ArrayAnswers[3])))
                    return true;
                break;
        }
        return false;
    }
    public void UserAnswer(String [] ArrayAnswers, String Answer)
    {
        System.out.print(TabsNumbers(10));
        String UserInputChoice = Input.nextLine();
        while (!UserInputChoice.equals("A") && !UserInputChoice.equals("B") && !UserInputChoice.equals("C") && !UserInputChoice.equals("D"))
        {
            System.out.println(TabsNumbers(10) + "Invalid Input, Please try again.");
            System.out.print(TabsNumbers(10));
            UserInputChoice = Input.nextLine();
            while(UserInputChoice.isEmpty()||UserInputChoice==null)
            {
                System.out.print(TabsNumbers(10));
                UserInputChoice = Input.nextLine();
            }
        }
        if(CheckUserAnswer(UserInputChoice.charAt(0),ArrayAnswers,Answer))
        {
            System.out.println(TabsNumbers(10) + "Correct Choice :-).");
            AnswersCounter++;
        }
        else
        {
            System.out.println(TabsNumbers(10) + "Wrong Choice :-(.");
        }
    }
    public void ShowAnswers(String FullQuestion,int GetRandomQuestion)
    {
        String [] ArrayAnswers = HandleQuestionAnswers(FullQuestion,GetRandomQuestion);
        for(String i : ArrayAnswers)
        {
            System.out.println(TabsNumbers(10) + i);
        }
        System.out.print(TabsNumbers(10) + "-------------------------------------------");
        System.out.println("------------------------");
        UserAnswer(ArrayAnswers,GetAnswersOnly(FullQuestion));
    }
    public void ShowQuestions()
    {
        String FullQuestion = "";
        int GetRandomQuestion = 0;
        do
        {
            GetRandomQuestion = (int) (Math.random() * 50);
            FullQuestion = ArrayOfQuestions[GetRandomQuestion];
        }while(IsQuestionHasBeenAskedBefore.contains(FullQuestion));
        IsQuestionHasBeenAskedBefore.add(FullQuestion);
        System.out.print(TabsNumbers(10) + "-------------------------------------------");
        System.out.println("------------------------");
        System.out.println(TabsNumbers(10)+GetQuestionOnly(FullQuestion));
        ShowAnswers(FullQuestion,GetRandomQuestion);
    }
    public void PlayQuizGame()
    {
        IsQuestionHasBeenAskedBefore.clear();
        int QuestionsCounter=0;
        while(QuestionsCounter < 10)
        {
            ShowQuestions();
            QuestionsCounter++;
        }
    }
    public void Display()
    {
        ClearerTheScreen();
        System.out.print(TabsNumbers(10) + "-------------------------------------------");
        System.out.println("------------------------");
        System.out.println(TabsNumbers(15)+"Welcome to the general quiz exam.");
        System.out.print(TabsNumbers(10) + "-------------------------------------------");
        System.out.println("------------------------");
        PlayQuizGame();
        if(AnswersCounter < 6)
        {
            System.out.println(TabsNumbers(10) + "Your Final Score is " + AnswersCounter);
            System.out.println(TabsNumbers(10) + "You have a weak general knowledge :-(.");
        }
        else if(AnswersCounter < 8)
        {
            System.out.println(TabsNumbers(10) + "Your Final Score is " + AnswersCounter);
            System.out.println(TabsNumbers(10) + "You have a normal general Knowledge :-|.");
        }
        else
        {
            System.out.println(TabsNumbers(10) + "Your Final Score is " + AnswersCounter);
            System.out.println(TabsNumbers(10) + "You have a good General Knowledge :-).");
        }
        System.out.println(TabsNumbers(10) + "Press Any Key to go back to the main menu.");
        Input.nextLine();
        MainMenuScreen MainMenu = new MainMenuScreen();
        MainMenu.DisplayMainMenuScreen(1);
    }
}
