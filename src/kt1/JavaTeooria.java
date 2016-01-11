/*
       1.
        Milline j�rgnevatest keele Java t��pidest on algt��p (primitive type)?
        Which of the following is a primitive type in Java?
        Choose one answer.
           a. Boolean   
           *b. long    //�ige vastus on alati v�ikese algust�hega.
           c. Integer   
           d. Double   



        2.
        Mida t�histab keeles Java j�rgmine kirjutis?
        What does the following mean in Java?

        -0.5e-2

        Choose one answer.
           *a. 64-bitine reaalarv -0.005 ; 64-bit real number -0.005    //Tegu double t��pi muutujaga, ehk siis 64 bit'i. e-2 on (*10^-2), ehk -(0.5*10^-2)= -0.005
           b. 64-bitine reaalarv -50.00 ; 64-bit real number -50.00   
           c. 32-bitine reaalarv -0.005 ; 32-bit real number -0.005   
           d. 64-bitine reaalarv -0.05 ; 64-bit real number -0.05   



        3.
        Millise tulemuse annab j�rgmine programmil�ik?
        What is the result of the following program?

        int a = 4;
        int b = a++ / 5;


        Choose one answer.
           a. a==5 && b==1    //See oli Kapteni valik, aga ma vaidleksin selle koha peal.
           *b. a==5 && b==0    //Enne tehtakse tehe ja siis suurendatakse muutujat a �he v�rra. See annab: int b = 4/5 = 0,8. Tegu int t��pi muutujaga, ehk siis kaob k�ik peale koma (�mardamist ei toimu) b == 0. Kui ei usu, siis proovige Eclipse'is j�rgi teha ja kontrollige vastust.
           c. a==5 && b==0.8   
           d. a==4 && b==0   



        4.
        Milline tingimus kirjeldab n mittekuulumist pooll�iku [0, 10) ?
        Which of the following conditions says that n does not belong to the half-closed interval [0,10) ?
        Choose one answer.
           *a. (n <0) || (n >= 10)    // Saame n=(-?; 0)U[10; +?) lihtne loogika t�estab seda.
           b. (n >= 0) && (n < 10)   
           c. (n < 0) && (n >= 10)   
           d. (n >=0) || (n < 10)




        5.
        Java programmi l�htekood on failis laiendiga:
        Source code of a Java program has file extension:
        Choose one answer.
             *a. .java    //Vastas Kapten ja n�ustun.
           b. .xml   
           c. .txt   
           d. .class
           


        6.
        Milline allj�rgnevatest keeltest esindab loogilise programmeerimise paradigmat? Which of the following programming languages represents the logic programming paradigm?
        Choose one answer.
          * a. Prolog    //Arendajad saavad sellega varsti ise tutvust teha ;]
           b. Smalltalk   
           c. Ada   
           d. Haskell   



        7.
        Java return lause...
        A return statement in Java...
        Choose one answer.
           a. v�ljastab teksti; outputs text   
             *b. annab juhtimise tagasi meetodi v�ljakutsujale; returns    control to the invoker of a method    //Vastas Kapten ja n�ustun.
           c. tekitab erindi (vea); throws an exception (error)   
           d. ei tee midagi (tühilause); does nothing (empty statement)   


        8.
        Olgu muutuja m keeles Java kirjeldatud kui t�isarvude massiiv. M�lu eraldamiseks massiivi m 10 elemendi jaoks tuleb kirjutada...

        Let variable m be defined as an array of integers. To allocate memory for 10 elements in m one has to write...
        Choose one answer.

           a. m[9] = 0;   
           b. m.length = 10;   
             *c. m = new int [10];    //Vastas kapten ja n�ustun.
           d. m.allocate (10);

        9. Programmeerimiskeele s�ntaksit kirjeldab...
        Syntax of a programming language is described by...
            a. IDE   //Integrated development environment
            b. testide hulk; set of tests   //WTF?
            c. API   //Pakun, et see, aga pead ei anna. See on k�ll reeglistik kuidas peab kirjutama, ehk siis n�itab s�ntaksit, aga kas on see. :]
            *d. grammatika; grammar   //Ma pakuks, et see on n�. tavalise keele API. x]

        10. Java continue lause...
        A continue statement in Java...
            a. ei tee midagi (t�hilause); does nothing (empty statement)   //Midagi ikka teeb.
            *b. l�petab sisemise ts�kli sammu; ends the current iteration of innermost loop   //L�petab sammu ja l�heb j�rgmise sammu juurde.
            c. l�petab sisemise ts�kli v�i valikulause t�itmise; ends the innermost loop or switch statement   //Seda teeb break;
            d. annab juhtimise tagasi meetodi v�ljakutsujale; returns control to the invoker of a method   //Seda teeb return;


KT2 - V�ib olla valesid vastuseid, kiire pilguga kontrollisin sinu variandiga �le ja parandasin

    �hene p�rimine t�hendab, et:

       *iga klass saab olla �limalt �he klassi alamklass; each class can be a subclass of at most one class


    Mida v�ljendab selle programmil�igu teine rida?
    What is the meaning of the second line in this program?

          String s = "Hello";
          int len = s.length();

       *Objektiga s seotud isendimeetodi v�ljakutset. Call of an instance method for the object s.




    Java algt��pidesse kuuluvate andmete v�ljastamiseks on ette n�htud meetodid klassis:
    Vali vastus:
       *a. DataOutputStream
       b. File
       c. FileWriter
       d. ByteArrayOutputStream


    Millise eriolukorra (loetelutest) tuvastamine ja t��tlemine on Javas m�ttekas:
    Vali vastus:
       a. checked execption
        b. Error
       c. RuntimeException
       *d. Exception


    Isendimuutujate v��rtused m��ravad:
    Vali �ks vastus:
       *a. objekti oleku   
        b. objekti klassi
        c. objekti k�itumise


    Mitmene p�rimine t�hendab, et:
       * klass v�ib omadusi p�rida mitmelt �lemklassilt



    Java rakendus (application) peab sisaldama meetodit, mille signatuur on...
    Vali �ks vastus.
        a. public void run()   
        b. public static int main (String[] )   
       *c. public static void main (String[] )   
        d. public void main (String )

       
    Meetodi poole p��rdumisel kirjutatakse meetodi nime j�rele sulgudesse:
    Vali �ks vastus.
        a. tagastusv��rtus; return value   
       *b. tegelikud parameetrid; actual parameters   
        c. signatuur; signature   
        d. formaalsed parameetrid; formal parameters

       
    Mida v�ljendab allj�rgnev programmil�ik?
    What is the meaning of the following Java code?

    String s = String.valueOf(1234);

    Vali �ks vastus.
       *a. klassi String klassimeetodi poole p��rdumist; a class method of class String is invoked   
        b. klassi String konstruktori poole p��rdumist; a construktor of class String is invoked   
        c. objekti s isendimeetodi poole p��rdumist; an instance method is invoked for the object s   
        d. jooksva klassi isendimeetodi poole p��rdumist; an instance method of current class is invoked   


    �hene p�rimine t�hendab, et:
    Single inheritance means that

    Vali �ks vastus.
        a. teate poolt aktiviseeritav meetod valitakse programmi lahendamise ajal; the method activated by a message is chosen during runtime   
       *b. iga klass saab olla �limalt �he klassi alamklass; each class can be a subclass of at most one class   
        c. teate poolt aktiviseeritav meetod valitakse programmi kompileerimise ajal; the method activated by a message is chosen during compile time   
        d. klass v�ib omadusi p�rida mitmelt �lemklassilt; a class can inherit properties from several superclasses   


    Javadoc @return
    abil dokumenteeritakse:
    is used to document:

    Vali �ks vastus.
        a. meetodi poolt tekitatavaid erindeid; exceptions thrown by the method   
        b. versiooniinfot; version information   
        c. meetodi parameetrit; a method parameter   
       *d. meetodi tagastusv��rtust; a method return value


    Java koodistiil n�uab muutujate nimede kirjutamist:
    Variable names in Java are written:

    Vali �ks vastus.
        a. ainult suurt�htedega; with all capital letters   
        b. suure algust�hega; starting with capital letter   
        c. kreeka keeles; in Greek   
       *d. v�ikese algust�hega; starting with lowercase letter   


    Iteraator v�imaldab:
    Iterator is used to

    Vali �ks vastus.
        a. otsustada, kumb kahest elemendist on suurem; decide which of the two elements is greater   
        b. salvestada paare "v�ti-v��rtus"; store the "key - value" pairs   
       *c. k�sida andmekogumi j�rgmist elementi; ask the next element of a collection   
        d. lisada hulka korduvaid elemente; add multiple elements to the set   


    Paisktabelit esindab Java APIs liides:
    Which of the following Java interfaces represents the hashtable

    Vali �ks vastus.
        a. Collection   
       *b. Map   
        c. Comparable   
        d. Set   


    Eriolukorda, mille t��tlemine programmeerija poolt on v�imalik, aga mitte kohustuslik, kirjeldab Java klass:
    Handling the instances of ... is not compulsory (but still possible) in Java.

    Vali �ks vastus.
        a. IOException   
        b. Error   
        *c. RuntimeException
        d. Exception   


    Tekstivoo lugemisel meetodiga readLine() annab voo l�ppemisest m�rku:
    Text stream is read using the readLine() method. End of stream is reported as

    Vali �ks vastus.
        a. (int)0   
        b. (int)-1   
        *c. "\n"   
        d. (String)null


    Bytestream is read using the read() method. End of stream is reported as
    Vali �ks vastus.
       *a. (int)-1    
       b. (String)null    
       c. (int)0
       d. (byte)-128


    Javadoc @param
    abil dokumenteeritakse:
    is used to document:
    Vali �ks vastus.
        a. meetodi poolt tekitatavaid erindeid; exceptions thrown by the method   
        b. versiooniinfot; version information   
       *c. meetodi parameetrit; a method parameter   
        d. meetodi tagastusv��rtust; a method return value


    Liides List keeles Java v�imaldab:
    List interface in Java is used to
    Vali �ks vastus.
       *c. salvestada andmestruktuuri korduvaid elemente, mida eristatakse indeksi j�rgi; store multiple elements to the data structure that can be accessed by index


    Kahe elemendi omavahelise j�rjestuse m��ramiseks sobib Java APIs liides:
    Which of the following Java interfaces is suitable for determining the order of two elements
    Vali �ks vastus:
       a. Map    
        b. Set    
       c. Collection    
       *d. Comparable    


    Meetodi p�ises kirjeldatud muutujad (meetodi nime j�rel sulgudes) on:

    Vali �ks vastus:
       *a. formaalsed parameetrid; formal parameters
       c. signatuur; signature
       

    What is the return type of method m?

       public static String m (double d, int i)

    Vali vastus:
       *a. String
       b. void
       c. int
       d. double

    K�su return j�rele kirjutatud avaldisega m��ratakse:
    An expression in the return-statement defines:

    Vali �ks vastus:
       a. formaalsed parameetrid; formal parameters
       *b. tagastusv��rtus; return value
       c. signatuur; signature
       d. tegelikud parameetrid; actual parameters

    Teate saatmine objektile t�hendab:
    Sending a message to an object means that.

    Vali �ks vastus:
       a. objektile m�lu eraldamist; memory for the object allocated
       b. p��rdumist vastava klassimeetodi poole; a corresponding class method is invoked
       c. objektile uue stringiesituse m��ramist; a new string representation for the object is defined
       *d. p��rdumist vastava isendimeetodi poole; a corresponding instance method is invoked

	   
    Hiline seostamine t�hendab, et:
    Late binding means that.

    Vali vastus:
        *a. teate poolt aktiviseeritav meetod valitakse programmi lahendamise ajal; the method activated by a message is chosen during runtime
       b. klass v�ib omadusi p�rida mitmelt �lemklassilt; a class can inherit properties from several superclasses
       c. iga klass saab olla �limalt �he klassi alamklass; each class can be a subclass of at most one class
       d. teate poolt aktiviseeritav meetod valitakse programmi kompileerimise ajal; the method activated by a message is chosen during compile time

    Varane seostamine t�hendab, et:
        *a. teate poolt aktiviseeritav meetod valitakse programmi lahendamise ajal; the method activated by a message is chosen during runtime

    Javadoc @since
    abil dokumenteeritakse:

    Vali vastus:
       a. hetkel kasutatavat Java kompilaatori versiooni; current Java compiler version
       *b. varaseimat Java kompilaatori versiooni, millega klass kompileerub; earliest Java compiler version to compile the class
       c. klass versiooniinfot; version information of the class
       d. Java versiooni, millest alates seda klassi ei toetata; Java version starting from which this class is depricated


    Java koodistiil n�uab muutujate nimede kirjutamist:
    Variable names in Java are written:

    Vali vastus:
       a. ainult suurt�htedega; with all capital letters
       *b. v�ikeste algust�htedega; starting with lowercase letter
       c. suure algust�hega; starting with lowercase letter
       d. kreeka keeles; in Greek


    Liides Comparable keeles Java v�imaldab:
    Comparable interface in Java is used to:

    Vali vastus:
       *a. otsustada, kumb kahest elemendist on suurem; decide which of the two elements is grater
       b. salvestada paare "v�ti-v��rtus"; store the "key-value" pairs
       c. k�sida andmekogumi j�rgmist elementi; ask the next element of a collection
       d. lisada hulka korduvaid elemente, add multiple elements to the set


    Korduvate elementideta j�rjestatud hulka esindab Java APIs klass:
    Which of the following Java classes represents a sorted set that cannot contain duplicated elements

    Vali vastus:
       a. ArrayList
       b. LinkedList
       *c. TreeSet
       d. Iterator


    9.
    Eriolukorda, mille t��tlemine programmeerija poolt on Javas kohustuslik, nimetatakse:
    Handling the instance of ... is compulsory in Java

    Vali vastus:
       *a. checked execption
       b. Error
       c. RuntimeException
       d. Exception

    Java algt��pidesse kuuluvate andmete sisestamiseks on ette n�htud meetodid klassis:
    To read data of Java primitive data types programmer can use method of class

    Vali vastus:
       *a. DataInputStream
       b. File
       c. FileReader
       d. ByteArrayInputStream
       
       
    Java koodistiil n�uab klassinimede kirjutamist:
       a. v�ikese algust�hega; starting with lowercase letter    
       b. ainult suurt�htedega; with all capital letters    
       *c. suure algust�hega; starting with capital letter    
       d. ainult v�ikeste t�htedega; with all lowercase letters
       
       
    Millise eriolukorra (loetletutest) tuvastamine ja t��tlemine on Javas m�ttekas:
        a. ThreadDeath     
        b. OutOfMemoryError     
        c. Error     
       *d. Exception     


    Meetodi nimi koos piiritlejate, parameetrite t��pide ning tagastusv��rtuse t��biga on tuntud kui meetodi:
       a. tegelikud parameetrid; actual parameters    
       b. tagastusv?�?�rtus; return value    
       *c. signatuur; signature    
       d. formaalsed parameetrid; formal parameters

    Liides Map keeles Java v�imaldab:
        a. lisada hulka korduvaid elemente; add multiple elements to the set    
        b. otsustada, kumb kahest elemendist on suurem; decide which of the two elements is greater    
        c. k�sida andmekogumi j�rgmist elementi; ask the next element of a collection    
       *d. salvestada paare "v�ti-v��rtus"; store the "key - value" pairs    


    Objekti (isendi) k�itumise m��ravad:
       a. isendimuutujate v��rtused; values of instance variables    
       b. klassimuutujate v��rtused; values of class variables    
       c. klassimeetodid; class methods    
       *d. isendimeetodid; instance methods    
       
    Destruktor on:
       a. meetod isendi loomiseks; a method to create an instance    
       *b. meetod isendi h�vitamiseks, keeles Java puudub; a method to destroy an instance, not supported in Java    
       c. isendimeetod, mis teisendab objekti stringiks; an instance method to convert the object into string    
       d. d�naamilise pikkusega andmestruktuur; data structure with dynamic length    

    Kogumi elementide s�stemaatiliseks l�bik�imiseks sobib Java APIs liides:
       *a. Iterator    
        b. Map    
        c. Comparable    
        d. Set    
       
       
    Mis t�histab baidivoo l�ppu?

    * -1





Eksami pildid - kontrollitud, k�simused v�ivad korduda varasematega


1.Java bytecode produced by java compiler has file extension.
a. .xml
b. .java
*c. .class 
d. .txt

2. Milline j�rgnevatest keeltest esindab imperatiivse programmeerimise paradigmat?
*a. Ada
b. Haskell
c. Smalltalk
d. Prolog

3. Milline j�rgnevatest keele Java t��pidest on algt��p (primitive type)?
a. Long
*b. boolean
c. Double
d. Integer

4. Mida t�histab keeles Java j�rgmine kirjutis? //vaata �le, peaks �ige olema
-0xa

a. Ei ole javas lubatud; Is not allowed in Java
b. 16-bitine t�isarv -10; 16-bit Integer -10 Int 32bit //vale vastus
*c. 32-bitine t�isarv -10; 32-bit Integer -10
d. 64-bitine t�isarv -10;64-bit Integer -10

5. Millise tulemuse annab j�rgmine programmil�ik?
[code java]
int a = 4
int b = a++ /5;
[/code]
a. a==4 && b==0
*b. a==5 && b==0
c. 
d.

6. Milline tingimis kirjeldab n mittekuulumist pooll�iki [0,10)?
 *a. (n <0) || (n >= 10)    // Saame n=(-?; 0)U[10; +?) lihtne loogika t�estab seda.
b. (n >= 0) && (n < 10)   
c. (n < 0) && (n >= 10)   
d. (n >=0) || (n < 10)

7. Java return lause...
a. v�ljastab teksti; outputs text   
*b. annab juhtimise tagasi meetodi v�ljakutsujale; returns    control to the invoker of a method   
c. tekitab erindi (vea); throws an exception (error)   
d. ei tee midagi (tühilause); does nothing (empty statement)

8. K�su return j�rele kirjutatud avaldisega m��ratakse:
a. formaalsed parameetrid; formal parameters
*b. tagastusv��rtus; return value
c. signatuur; signature
d. tegelikud parameetrid; actual parameters

9.Java rakendus (application) peab sisaldama meetodit, mille signatuur on...
a. public void run()   
b. public static int main (String[] )   
*c. public static void main (String[] )   
d. public void main (String )

10. Javadoc @param abil dokumenteeritakse:
a. meetodi poolt tekitatavaid erindeid; exceptions thrown by the method   
b. versiooniinfot; version information   
*c. meetodi parameetrit; a method parameter   
d. meetodi tagastusv��rtust; a method return value

11.Java koodistiil n�uab klassinimede kirjutamist:
a. v�ikese algust�hega; starting with lowercase letter    
b. ainult suurt�htedega; with all capital letters    
*c. suure algust�hega; starting with capital letter    
d. ainult v�ikeste t�htedega; with all lowercase letters

12. Objekti (isendi) identiteedi Javas m��ravad:
*a. m�luaadress 
b. objekti esitlus s�ne kujul
c. isendimuutujate v��rtuste hulk
d. klassimuutujate v��rtuste hulk

13. Destruktor on:
a. meetod isendi loomiseks;  
*b. meetod isendi h�vitamiseks, keeles Java puudub
c. isendimeetod, mis teisendab objekti stringiks
d. d�naamilise pikkusega andmestruktuur

14.Liides Comparable keeles Java v�imaldab:
*a. otsustada, kumb kahest elemendist on suurem; decide which of the two elements is grater
b. salvestada paare "v�ti-v��rtus"; store the "key-value" pairs
c. k�sida andmekogumi j�rgmist elementi; ask the next element of a collection
d. lisada hulka korduvaid elemente, add multiple elements to the set

15. Kogumi elementide s�stemaatiliseks l�bik�imiseks sobib Java APIs liides:
*a. Iterator    
b. Map    
c. Comparable    
d. Set 

16. Olukorda, milles Java programmi t��d pole otstarbekas j�tkata ning mille tekkimist reeglina ka ei t��delda, kirjeldab klass:
Situation when it is not reasonable to continue the execution of a Java program and which in general is not handled by a programmer is described by class:

a. RuntimeException
b. Exception
c. IOException
*d. Error

17. Java algt��pidesse kuuluvate andmete v�ljastamiseks on ette n�htud meetodid klassis:
*a. DataOutputStream
b. File
c. FileWriter
d. ByteArrayOutputStream

18. Millist kasutajaliidese aspekti juhib paigutushaldur?
a. liidese mudeli
*b. liidese visuaalne kuju
c. liidese reageerimine s�ndmustele
d. liidese seos v�lise keskkonnaga

19. Rakendi eluts�kli alguses t�idetakse meetod:
a. start
*b. init
c. repaint
d. paint

20. Milline k�sk joonistab ringjoone raadiusega 50 pikselit?
a. g.fillOval (50, 50, 50, 50)
b. g.drawOval (50, 50, 50, 50)
*c. g.drawOval (0, 0, 100, 100)
d.








Foorumikraam - kontrollimata, k�simused v�ivad korduda varasematega




3. Mida t�histab keeles Java j�rgmine kirjutis? What does the following mean in Java? -0.5e-2f 
    * 32-bitine reaalarv -0.0050 ; 32-bit real number -0.0050


5.Java programmi l�htekood on failis laiendiga:
    *.java
       

11.Java programmi transleerimisel tekkiv baitkood on failis laiendiga
        *class

12. V�tmes�na "while" j�rele �marsulgudesse kirjutatav tingimus on... 
        * ts�kli j�tkamise tingimus
   
 
:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
KT2


33.	Konstruktor on
�	meetod isendi loomiseks
34. 	Javadoc @version abil dokumenteeritakse
�	klassi versiooniinfot
38. 	Millist kasutajaliidese aspekti juhivad kuularid? 
�	liidese visuaalne kuju
39. Rakendi kuva v�rskendamist saab tellida p��rdudes meetodi ... poole. 
�	repaint
42. Java koodistiil n�uab konstantide nimede kirjutamist:
�	SUURTE T�HTEDEGA JA ALAKRIIPSUDEGA IMHO nt DARK_GRAY


Programmeerimiskeele s�ntaksit kirjeldab...
a. testide hulk
+ b. grammatika
c. API  Vale
d. IDE

Milline allj�rgnevatest keeltest esindab objektorienteeritud programmeerimise paradigmat? 
a. Haskell
b. Ada
c. Prolog Vale
+ d. Smalltalk

Milline allj�rgnevatest keeltest esindab imperatiivse programmeerimise paradigmat?
+ a. Ada
b. Haskell
c. Smalltalk
d. Prolog

Milline allj�rgnevatest keeltest esindab loogilise programmeerimise paradigmat? 
a. Haskell 
b. Smalltalk 
c. Ada 
+ d. Prolog

Milline j�rgnevatest t��pidest EI OLE algt��p (primitive type)?
a. boolean
b. double
+ c. Long 
d. float

Milline j�rgnevatest keele Java t��pidest on algt��p (primitive type)?
a. Long
+ b. boolean
c. Double
d. Integrer

Mida t�histab keeles Java j�rgmine kirjutis? -0xa
a. Ei ole Javas lubatud
b. 16-bitine t�isarv -10 Vale
c. 32-bitine t�isarv -10
d. 64-bitine t�isarv -10

Mida t�histab keeles Java j�rgmine kirjutis?  -0.5e-2 
a. 32-bitine reaalarv -0.005
b. 64-bitine reaalarv -50.00
c. 64-bitine reaalarv -0.05
+ d. 64-bitine reaalarv -0.005 

Mida t�histab keeles Java j�rgmine kirjutis? -0.5e-2f 
a. 32-bitine reaalarv -0.05 
+ b. 32-bitine reaalarv -0.005
c. 64-bitine reaalarv -0.005
d. 32-bitine reaalarv -50.00

Millise tulemuse annab j�rgmine programmil�ik? 
int a = 9; 
int b = ++a / 5; 
a. a==10 && b==1 
b. a==9 && b==1 
c. a==9 && b==2 
+ d. a==10 && b==2

Millise tulemuse annab j�rgmine programmil�ik? 
[code java]
int a = 4;
int b = a++ / 5;
[/code]
a. a==5 && b==0.8
b. a==4 && b==0
c. a==5 && b==1
+ d. a==5 && b==0 

Mida v�ljendab allj�rgneva programmil�igu teine lause? 
String s = "Hello"; 
int len = s.length(); 
a. klassi String klassimeetodi poole p��rdumist 
b. jooksva klassi isendimeetodi poole p��rdumist
c. klassi Integer konstruktori poole p��rdumist
d. objekti s isendimeetodi poole p��rdumist

Milline tingimus kirjeldab n mittekuulumist pooll�iku [0, 10) ? 
a. (n >= 0) && (n < 10)
+ b. (n <0) || (n >= 10)
c. (n >=0) || (n < 10)
d. (n < 0) && (n >= 10)

V�tmes�na "while" j�rele �marsulgudesse kirjutatav tingimus on... 
a. Java virtuaalmasina peatamise tingimus
b. ts�kli l�petamise tingimus
c. meetodist v�ljumise tingimus
+ d. ts�kli j�tkamise tingimus 

K�su return j�rele kirjutatud avaldisega m��ratakse: 
a. tegelikud parameetrid
b. formaalsed parameetrid
c. signatuur
+ d. tagastusv��rtus

Java return lause...
a. annab juhtimise tagasi meetodi v�ljakutsujale
b. tekitab erindi (vea)
c. ei tee midagi (t�hilause)
d. v�ljastab teksti

Meetodi nimi koos piiritlejate, parameetrite t��pide ning tagastusv��rtuse t��biga on tuntud kui meetodi:
a. tegelikud parameetrid Vale
+ b. signatuur
c. formaalsed parameetrid
d. tagastusv��rtus

Java rakendus (application) peab sisaldama meetodit, mille signatuur on... 
a. public static int main (String[] ) 
b. public void main (String ) 
c. public void run() 
+ d. public static void main (String[] )

Millist t��pi v��rtuse tagastab meetod m?
public static int m (double d, String s)
+ a. int
b. double
c. String
d. void

Javadoc @version abil dokumenteeritakse: 
+ a. klassi versiooniinfot
b. meetodi tagastusv��rtust
c. meetodi parameetrit
d. meetodi poolt tekitatavaid erindeid

Javadoc @since abil dokumenteeritakse:
a. klassi versiooniinfot
b. hetkel kasutatavat Java kompilaatori versiooni
c. Java versiooni, millest alates seda klassi ei toetata
+ d. varaseimat Java kompilaatori versiooni, millega klass kompileerub

Javadoc @param abil dokumenteeritakse:
+ a.meetodi parameetrit

Java koodistiil n�uab konstantide nimede kirjutamist:
a. ainult suurt�htedega
b. kreeka keeles
c. suure algust�hega Vale
+ d. v�ikese algust�hega

Java koodistiil n�uab klassinimede kirjutamist:
+ a.suure algust�hega
b. ainult v�ikeste t�htedega
c. v�ikese algust�hega
d. ainult suurt�htedega

Teate saatmine objektile t�hendab:
a. objektile m�lu eraldamist
+ b. p��rdumist vastava isendimeetodi poole
c. objektile uue stringiesituse m��ramist
d. p��rdumist vastava klassimeetodi poole

Objekti (isendi) identiteedi Javas m��rab:
+ a. m�luaadress
b. objekti esitus s�ne kujul
c. isendimuut ujate v��rtuste hulk
d. klassimuutujate v��rtuste hulk

Destruktor on:
a. d�naamilise pikkusega andmestruktuur
+ b. meetod isendi h�vitamiseks, keeles Java puudub
c. isendimeetod, mis teisendab objekti stringiks
d. meetod isendi loomiseks

Liides List keeles Java v�imaldab: 
a. k�sida andmekogumi j�rgmist elementi
b. salvestada paare "v�ti-v��rtus" Vale
c. otsustada, kumb kahest elemendist on suurem
d. salvestada andmestruktuuri korduvaid elemente, mida eristatakse indeksi j�rgi

Liides Comparable keeles Java v�imaldab:
a. salvestada paare "v�ti-v��rtus"
b. lisada hulka korduvaid elemente
+ c. otsustada, kumb kahest elemendist on suurem
d. k�sida andmekogumi j�rgmist elementi

Java break lause... 
a. annab juhtimise tagasi meetodi v�ljakutsujale
b. l�petab Java virtuaalmasina t��
c. l�petab sisemise ts�kli sammu
+ d. l�petab sisemise ts�kli v�i valikulause t�itmise

Paaride "v�ti - v��rtus" salvestamiseks sobib Java APIs klass: 
 a. TreeSet 
b. ArrayList 
+ c. HashMap 
d. Iterator 

Paisktabelit esindab Java APIs liides:
a. Collection
+ b. Map
c. Comparable
d. Set

Millise eriolukorra (loetletutest) tuvastamine ja t��tlemine on Javas m�ttekas: 
a. ThreadDeath 
+ b. Exception
c. Error 
d. OutOfMemoryError 

Eriolukorda, mille t��tlemine programmeerija poolt on Javas kohustuslik, nimetatakse:
+ a. checked exception
b. RuntimeException Vale
c. Error
d. Exception

Baidivoo lugemisel meetodiga read() annab voo l�ppemisest m�rku:
a. (String)null
+ b. (int)-1 
c. (byte)-128
d. (int)0

Millist kasutajaliidese aspekti juhib paigutushaldur?
+ a. liidese visuaalne kuju
b. liidese mudel
c. liidese seos v�lise keskkonnaga
d. liidese reageerimine s�ndmustele

�hene p�rimine t�hendab, et: 
a. teate poolt aktiviseeritav meetod valitakse programmi lahendamise ajal 
b. teate poolt aktiviseeritav meetod valitakse programmi kompileerimise ajal 
c. klass v�ib omadusi p�rida mitmelt �lemklassilt 
+ d. iga klass saab olla �limalt �he klassi alamklass 

Rakendi kuva v�rskendamist saab tellida p��rdudes meetodi ... poole.
a. start
+ b. repaint
c. paint Vale
d. init

Rakendi passiivseks muutumisel p��rdutakse meetodi ... poole. 
+ a. stop
b. start 
c. repaint 
d. init 

Rakendi eluts�kli alguses t�idetakse meetod:
a. start Vale
b. init
c. repaint
d. paint

Milline k�sk joonistab ringi (pinna) l�bim��duga 50 pikselit?
a. g.drawOval (50, 50, 50, 50);
b. g.drawOval (0, 0, 100, 100);
c. g.fillOval (0, 0, 100, 100);  Vale
d. g.fillOval (50, 50, 50, 50);

Milline k�sk joonistab ringjoone l�bim��duga 50 pikselit? 
a. g.fillOval (50, 50, 50, 50); 
b. g.fillOval (0, 0, 100, 100); 
c. g.drawOval (0, 0, 100, 100); 
+ d. g.drawOval (50, 50, 50, 50);

Milline k�sk joonistab ringjoone raadiusega 50 pikselit?
a.g.fillOval (50, 50, 50, 50);
b. g.drawOval (50, 50, 50, 50);
+ c. g.drawOval (0, 0, 100, 100);

Java algt��pidesse kuuluvate andmete sisestamiseks on ette n�htud meetodid klassis: 
a. DataInputStream 
b. ByteArrayInputStream 
c. File 
d. FileReader Vale

Java algt��pidesse kuuluvate andmete v�ljastamimseks on ette n�htud meetodid klassis:
a. FileWriter
b. ByteArrayOutputStream
c. File
+ d. DataOutputStream

Millist kasutajaliidese aspekti juhivad kuularid? 
a.liidese reageerimine s�ndmustele


Paaride" v�ti-v��rtus" salvesatamiseks sobib Java APIs klass:
a. TreeSet
b. ArrayList
c. HashMap +
d. Iterator

Hiline seostamine t�hendab,et 
a.teate poolt aktiviseeritav meetod valib programmi lahendamise ajal
b.klass v�ib omadusi p�rida mitmelt �lemklassilt
c. iga klass saab olla �limalt �he klassi alamklass
d.teate poolt aktiviseeritav meetod valitakse programmi kompileerimise ajal +

Isendimuutujate v��rtused m��ravad objekti:
Values of instance variables determine:

1. oleku; object state +
2. identiteedi; object identity
3. klassi; object class
4. k�itumise; object behaviour

Korduvate elementideta j�rjestatud hulka esindab java APIs klass:
a. ArrayList +
b. LinkList
c TreeSet
d. Iteraator

iteraator v�imaldab:
a. otsustada, kumb kahest elemendist on suurem
b. salvestada paare"v�ti-v��rtus"'
c.lisada hulka korduvaid elemente
d. k�sida andmekogumi j�rgmist elementi +

Meetodi p�ises kkirjutatud muutujad on 
a. tagastusv��rtus
b. tegelikud v��rtused +
c. formaalsed parameetrid
d. siganatuur

Kahe elemendi omavahelise j�rjestuse m��ramiseks sobib java APIs liides:
a)Collection
b)Comparable +
c)Map
d)Set

java programmi transleerimisel tekkiv baitkood on failis laiendiga
.class

java continue lause
l�petab sisemise ts�kli sammu

olgu muutuja m kelles Java kirjeldatud kui t�isarvude massiiv. M�lu eraldamiseks massiivi m 10 elemendi jaoks tuleb kirjutada:
a. m=new int[10] +
b.m.length=10
c.m[9]=0;
d.m.allocate

Java programmi l�htekood on failis laiendiga?
.java

Millist kasutajaliidese aspekti juhivad kuularid?
a.liidese reageerimine s�ndmustele

Java algt��pidesse kuuluvate andmete v�ljastamimseks on ette n�htud meetodid klassis:
a. FileWriter
b. ByteArrayOutputStream
c. File
d. DataOutputStream +

Java algt��pidesse kuuluvate andmete sisestamiseks on ette n�htud meetodid klassis: 
a. DataInputStream  +
b. ByteArrayInputStream 
c. File 
d. FileReader

Rakendi eluts�kli alguses t�idetakse meetod:
a. start 
b. init +
c. repaint
d. paint

*/

