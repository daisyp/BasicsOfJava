/*
       1.
        Milline järgnevatest keele Java tüüpidest on algtüüp (primitive type)?
        Which of the following is a primitive type in Java?
        Choose one answer.
           a. Boolean   
           *b. long    //Õige vastus on alati väikese algustähega.
           c. Integer   
           d. Double   



        2.
        Mida tähistab keeles Java järgmine kirjutis?
        What does the following mean in Java?

        -0.5e-2

        Choose one answer.
           *a. 64-bitine reaalarv -0.005 ; 64-bit real number -0.005    //Tegu double tüüpi muutujaga, ehk siis 64 bit'i. e-2 on (*10^-2), ehk -(0.5*10^-2)= -0.005
           b. 64-bitine reaalarv -50.00 ; 64-bit real number -50.00   
           c. 32-bitine reaalarv -0.005 ; 32-bit real number -0.005   
           d. 64-bitine reaalarv -0.05 ; 64-bit real number -0.05   



        3.
        Millise tulemuse annab järgmine programmilõik?
        What is the result of the following program?

        int a = 4;
        int b = a++ / 5;


        Choose one answer.
           a. a==5 && b==1    //See oli Kapteni valik, aga ma vaidleksin selle koha peal.
           *b. a==5 && b==0    //Enne tehtakse tehe ja siis suurendatakse muutujat a ühe võrra. See annab: int b = 4/5 = 0,8. Tegu int tüüpi muutujaga, ehk siis kaob kõik peale koma (ümardamist ei toimu) b == 0. Kui ei usu, siis proovige Eclipse'is järgi teha ja kontrollige vastust.
           c. a==5 && b==0.8   
           d. a==4 && b==0   



        4.
        Milline tingimus kirjeldab n mittekuulumist poollõiku [0, 10) ?
        Which of the following conditions says that n does not belong to the half-closed interval [0,10) ?
        Choose one answer.
           *a. (n <0) || (n >= 10)    // Saame n=(-?; 0)U[10; +?) lihtne loogika tõestab seda.
           b. (n >= 0) && (n < 10)   
           c. (n < 0) && (n >= 10)   
           d. (n >=0) || (n < 10)




        5.
        Java programmi lähtekood on failis laiendiga:
        Source code of a Java program has file extension:
        Choose one answer.
             *a. .java    //Vastas Kapten ja nõustun.
           b. .xml   
           c. .txt   
           d. .class
           


        6.
        Milline alljärgnevatest keeltest esindab loogilise programmeerimise paradigmat? Which of the following programming languages represents the logic programming paradigm?
        Choose one answer.
          * a. Prolog    //Arendajad saavad sellega varsti ise tutvust teha ;]
           b. Smalltalk   
           c. Ada   
           d. Haskell   



        7.
        Java return lause...
        A return statement in Java...
        Choose one answer.
           a. väljastab teksti; outputs text   
             *b. annab juhtimise tagasi meetodi väljakutsujale; returns    control to the invoker of a method    //Vastas Kapten ja nõustun.
           c. tekitab erindi (vea); throws an exception (error)   
           d. ei tee midagi (tÃ¼hilause); does nothing (empty statement)   


        8.
        Olgu muutuja m keeles Java kirjeldatud kui täisarvude massiiv. Mälu eraldamiseks massiivi m 10 elemendi jaoks tuleb kirjutada...

        Let variable m be defined as an array of integers. To allocate memory for 10 elements in m one has to write...
        Choose one answer.

           a. m[9] = 0;   
           b. m.length = 10;   
             *c. m = new int [10];    //Vastas kapten ja nõustun.
           d. m.allocate (10);

        9. Programmeerimiskeele süntaksit kirjeldab...
        Syntax of a programming language is described by...
            a. IDE   //Integrated development environment
            b. testide hulk; set of tests   //WTF?
            c. API   //Pakun, et see, aga pead ei anna. See on küll reeglistik kuidas peab kirjutama, ehk siis näitab süntaksit, aga kas on see. :]
            *d. grammatika; grammar   //Ma pakuks, et see on nö. tavalise keele API. x]

        10. Java continue lause...
        A continue statement in Java...
            a. ei tee midagi (tühilause); does nothing (empty statement)   //Midagi ikka teeb.
            *b. lõpetab sisemise tsükli sammu; ends the current iteration of innermost loop   //Lõpetab sammu ja läheb järgmise sammu juurde.
            c. lõpetab sisemise tsükli või valikulause täitmise; ends the innermost loop or switch statement   //Seda teeb break;
            d. annab juhtimise tagasi meetodi väljakutsujale; returns control to the invoker of a method   //Seda teeb return;


KT2 - Võib olla valesid vastuseid, kiire pilguga kontrollisin sinu variandiga üle ja parandasin

    Ühene pärimine tähendab, et:

       *iga klass saab olla ülimalt ühe klassi alamklass; each class can be a subclass of at most one class


    Mida väljendab selle programmilõigu teine rida?
    What is the meaning of the second line in this program?

          String s = "Hello";
          int len = s.length();

       *Objektiga s seotud isendimeetodi väljakutset. Call of an instance method for the object s.




    Java algtüüpidesse kuuluvate andmete väljastamiseks on ette nähtud meetodid klassis:
    Vali vastus:
       *a. DataOutputStream
       b. File
       c. FileWriter
       d. ByteArrayOutputStream


    Millise eriolukorra (loetelutest) tuvastamine ja töötlemine on Javas mõttekas:
    Vali vastus:
       a. checked execption
        b. Error
       c. RuntimeException
       *d. Exception


    Isendimuutujate väärtused määravad:
    Vali üks vastus:
       *a. objekti oleku   
        b. objekti klassi
        c. objekti käitumise


    Mitmene pärimine tähendab, et:
       * klass võib omadusi pärida mitmelt ülemklassilt



    Java rakendus (application) peab sisaldama meetodit, mille signatuur on...
    Vali üks vastus.
        a. public void run()   
        b. public static int main (String[] )   
       *c. public static void main (String[] )   
        d. public void main (String )

       
    Meetodi poole pöördumisel kirjutatakse meetodi nime järele sulgudesse:
    Vali üks vastus.
        a. tagastusväärtus; return value   
       *b. tegelikud parameetrid; actual parameters   
        c. signatuur; signature   
        d. formaalsed parameetrid; formal parameters

       
    Mida väljendab alljärgnev programmilõik?
    What is the meaning of the following Java code?

    String s = String.valueOf(1234);

    Vali üks vastus.
       *a. klassi String klassimeetodi poole pöördumist; a class method of class String is invoked   
        b. klassi String konstruktori poole pöördumist; a construktor of class String is invoked   
        c. objekti s isendimeetodi poole pöördumist; an instance method is invoked for the object s   
        d. jooksva klassi isendimeetodi poole pöördumist; an instance method of current class is invoked   


    Ühene pärimine tähendab, et:
    Single inheritance means that

    Vali üks vastus.
        a. teate poolt aktiviseeritav meetod valitakse programmi lahendamise ajal; the method activated by a message is chosen during runtime   
       *b. iga klass saab olla ülimalt ühe klassi alamklass; each class can be a subclass of at most one class   
        c. teate poolt aktiviseeritav meetod valitakse programmi kompileerimise ajal; the method activated by a message is chosen during compile time   
        d. klass võib omadusi pärida mitmelt ülemklassilt; a class can inherit properties from several superclasses   


    Javadoc @return
    abil dokumenteeritakse:
    is used to document:

    Vali üks vastus.
        a. meetodi poolt tekitatavaid erindeid; exceptions thrown by the method   
        b. versiooniinfot; version information   
        c. meetodi parameetrit; a method parameter   
       *d. meetodi tagastusväärtust; a method return value


    Java koodistiil nõuab muutujate nimede kirjutamist:
    Variable names in Java are written:

    Vali üks vastus.
        a. ainult suurtähtedega; with all capital letters   
        b. suure algustähega; starting with capital letter   
        c. kreeka keeles; in Greek   
       *d. väikese algustähega; starting with lowercase letter   


    Iteraator võimaldab:
    Iterator is used to

    Vali üks vastus.
        a. otsustada, kumb kahest elemendist on suurem; decide which of the two elements is greater   
        b. salvestada paare "võti-väärtus"; store the "key - value" pairs   
       *c. küsida andmekogumi järgmist elementi; ask the next element of a collection   
        d. lisada hulka korduvaid elemente; add multiple elements to the set   


    Paisktabelit esindab Java APIs liides:
    Which of the following Java interfaces represents the hashtable

    Vali üks vastus.
        a. Collection   
       *b. Map   
        c. Comparable   
        d. Set   


    Eriolukorda, mille töötlemine programmeerija poolt on võimalik, aga mitte kohustuslik, kirjeldab Java klass:
    Handling the instances of ... is not compulsory (but still possible) in Java.

    Vali üks vastus.
        a. IOException   
        b. Error   
        *c. RuntimeException
        d. Exception   


    Tekstivoo lugemisel meetodiga readLine() annab voo lõppemisest märku:
    Text stream is read using the readLine() method. End of stream is reported as

    Vali üks vastus.
        a. (int)0   
        b. (int)-1   
        *c. "\n"   
        d. (String)null


    Bytestream is read using the read() method. End of stream is reported as
    Vali üks vastus.
       *a. (int)-1    
       b. (String)null    
       c. (int)0
       d. (byte)-128


    Javadoc @param
    abil dokumenteeritakse:
    is used to document:
    Vali üks vastus.
        a. meetodi poolt tekitatavaid erindeid; exceptions thrown by the method   
        b. versiooniinfot; version information   
       *c. meetodi parameetrit; a method parameter   
        d. meetodi tagastusväärtust; a method return value


    Liides List keeles Java võimaldab:
    List interface in Java is used to
    Vali üks vastus.
       *c. salvestada andmestruktuuri korduvaid elemente, mida eristatakse indeksi järgi; store multiple elements to the data structure that can be accessed by index


    Kahe elemendi omavahelise järjestuse määramiseks sobib Java APIs liides:
    Which of the following Java interfaces is suitable for determining the order of two elements
    Vali üks vastus:
       a. Map    
        b. Set    
       c. Collection    
       *d. Comparable    


    Meetodi päises kirjeldatud muutujad (meetodi nime järel sulgudes) on:

    Vali üks vastus:
       *a. formaalsed parameetrid; formal parameters
       c. signatuur; signature
       

    What is the return type of method m?

       public static String m (double d, int i)

    Vali vastus:
       *a. String
       b. void
       c. int
       d. double

    Käsu return järele kirjutatud avaldisega määratakse:
    An expression in the return-statement defines:

    Vali üks vastus:
       a. formaalsed parameetrid; formal parameters
       *b. tagastusväärtus; return value
       c. signatuur; signature
       d. tegelikud parameetrid; actual parameters

    Teate saatmine objektile tähendab:
    Sending a message to an object means that.

    Vali üks vastus:
       a. objektile mälu eraldamist; memory for the object allocated
       b. pöördumist vastava klassimeetodi poole; a corresponding class method is invoked
       c. objektile uue stringiesituse määramist; a new string representation for the object is defined
       *d. pöördumist vastava isendimeetodi poole; a corresponding instance method is invoked

	   
    Hiline seostamine tähendab, et:
    Late binding means that.

    Vali vastus:
        *a. teate poolt aktiviseeritav meetod valitakse programmi lahendamise ajal; the method activated by a message is chosen during runtime
       b. klass võib omadusi pärida mitmelt ülemklassilt; a class can inherit properties from several superclasses
       c. iga klass saab olla ülimalt ühe klassi alamklass; each class can be a subclass of at most one class
       d. teate poolt aktiviseeritav meetod valitakse programmi kompileerimise ajal; the method activated by a message is chosen during compile time

    Varane seostamine tähendab, et:
        *a. teate poolt aktiviseeritav meetod valitakse programmi lahendamise ajal; the method activated by a message is chosen during runtime

    Javadoc @since
    abil dokumenteeritakse:

    Vali vastus:
       a. hetkel kasutatavat Java kompilaatori versiooni; current Java compiler version
       *b. varaseimat Java kompilaatori versiooni, millega klass kompileerub; earliest Java compiler version to compile the class
       c. klass versiooniinfot; version information of the class
       d. Java versiooni, millest alates seda klassi ei toetata; Java version starting from which this class is depricated


    Java koodistiil nõuab muutujate nimede kirjutamist:
    Variable names in Java are written:

    Vali vastus:
       a. ainult suurtähtedega; with all capital letters
       *b. väikeste algustähtedega; starting with lowercase letter
       c. suure algustähega; starting with lowercase letter
       d. kreeka keeles; in Greek


    Liides Comparable keeles Java võimaldab:
    Comparable interface in Java is used to:

    Vali vastus:
       *a. otsustada, kumb kahest elemendist on suurem; decide which of the two elements is grater
       b. salvestada paare "võti-väärtus"; store the "key-value" pairs
       c. küsida andmekogumi järgmist elementi; ask the next element of a collection
       d. lisada hulka korduvaid elemente, add multiple elements to the set


    Korduvate elementideta järjestatud hulka esindab Java APIs klass:
    Which of the following Java classes represents a sorted set that cannot contain duplicated elements

    Vali vastus:
       a. ArrayList
       b. LinkedList
       *c. TreeSet
       d. Iterator


    9.
    Eriolukorda, mille töötlemine programmeerija poolt on Javas kohustuslik, nimetatakse:
    Handling the instance of ... is compulsory in Java

    Vali vastus:
       *a. checked execption
       b. Error
       c. RuntimeException
       d. Exception

    Java algtüüpidesse kuuluvate andmete sisestamiseks on ette nähtud meetodid klassis:
    To read data of Java primitive data types programmer can use method of class

    Vali vastus:
       *a. DataInputStream
       b. File
       c. FileReader
       d. ByteArrayInputStream
       
       
    Java koodistiil nõuab klassinimede kirjutamist:
       a. väikese algustähega; starting with lowercase letter    
       b. ainult suurtähtedega; with all capital letters    
       *c. suure algustähega; starting with capital letter    
       d. ainult väikeste tähtedega; with all lowercase letters
       
       
    Millise eriolukorra (loetletutest) tuvastamine ja töötlemine on Javas mõttekas:
        a. ThreadDeath     
        b. OutOfMemoryError     
        c. Error     
       *d. Exception     


    Meetodi nimi koos piiritlejate, parameetrite tüüpide ning tagastusväärtuse tüübiga on tuntud kui meetodi:
       a. tegelikud parameetrid; actual parameters    
       b. tagastusv?¤?¤rtus; return value    
       *c. signatuur; signature    
       d. formaalsed parameetrid; formal parameters

    Liides Map keeles Java võimaldab:
        a. lisada hulka korduvaid elemente; add multiple elements to the set    
        b. otsustada, kumb kahest elemendist on suurem; decide which of the two elements is greater    
        c. küsida andmekogumi järgmist elementi; ask the next element of a collection    
       *d. salvestada paare "võti-väärtus"; store the "key - value" pairs    


    Objekti (isendi) käitumise määravad:
       a. isendimuutujate väärtused; values of instance variables    
       b. klassimuutujate väärtused; values of class variables    
       c. klassimeetodid; class methods    
       *d. isendimeetodid; instance methods    
       
    Destruktor on:
       a. meetod isendi loomiseks; a method to create an instance    
       *b. meetod isendi hävitamiseks, keeles Java puudub; a method to destroy an instance, not supported in Java    
       c. isendimeetod, mis teisendab objekti stringiks; an instance method to convert the object into string    
       d. dünaamilise pikkusega andmestruktuur; data structure with dynamic length    

    Kogumi elementide süstemaatiliseks läbikäimiseks sobib Java APIs liides:
       *a. Iterator    
        b. Map    
        c. Comparable    
        d. Set    
       
       
    Mis tähistab baidivoo lõppu?

    * -1





Eksami pildid - kontrollitud, küsimused võivad korduda varasematega


1.Java bytecode produced by java compiler has file extension.
a. .xml
b. .java
*c. .class 
d. .txt

2. Milline järgnevatest keeltest esindab imperatiivse programmeerimise paradigmat?
*a. Ada
b. Haskell
c. Smalltalk
d. Prolog

3. Milline järgnevatest keele Java tüüpidest on algtüüp (primitive type)?
a. Long
*b. boolean
c. Double
d. Integer

4. Mida tähistab keeles Java järgmine kirjutis? //vaata üle, peaks õige olema
-0xa

a. Ei ole javas lubatud; Is not allowed in Java
b. 16-bitine täisarv -10; 16-bit Integer -10 Int 32bit //vale vastus
*c. 32-bitine täisarv -10; 32-bit Integer -10
d. 64-bitine täisarv -10;64-bit Integer -10

5. Millise tulemuse annab järgmine programmilõik?
[code java]
int a = 4
int b = a++ /5;
[/code]
a. a==4 && b==0
*b. a==5 && b==0
c. 
d.

6. Milline tingimis kirjeldab n mittekuulumist poollõiki [0,10)?
 *a. (n <0) || (n >= 10)    // Saame n=(-?; 0)U[10; +?) lihtne loogika tõestab seda.
b. (n >= 0) && (n < 10)   
c. (n < 0) && (n >= 10)   
d. (n >=0) || (n < 10)

7. Java return lause...
a. väljastab teksti; outputs text   
*b. annab juhtimise tagasi meetodi väljakutsujale; returns    control to the invoker of a method   
c. tekitab erindi (vea); throws an exception (error)   
d. ei tee midagi (tÃ¼hilause); does nothing (empty statement)

8. Käsu return järele kirjutatud avaldisega määratakse:
a. formaalsed parameetrid; formal parameters
*b. tagastusväärtus; return value
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
d. meetodi tagastusväärtust; a method return value

11.Java koodistiil nõuab klassinimede kirjutamist:
a. väikese algustähega; starting with lowercase letter    
b. ainult suurtähtedega; with all capital letters    
*c. suure algustähega; starting with capital letter    
d. ainult väikeste tähtedega; with all lowercase letters

12. Objekti (isendi) identiteedi Javas määravad:
*a. mäluaadress 
b. objekti esitlus sõne kujul
c. isendimuutujate väärtuste hulk
d. klassimuutujate väärtuste hulk

13. Destruktor on:
a. meetod isendi loomiseks;  
*b. meetod isendi hävitamiseks, keeles Java puudub
c. isendimeetod, mis teisendab objekti stringiks
d. dünaamilise pikkusega andmestruktuur

14.Liides Comparable keeles Java võimaldab:
*a. otsustada, kumb kahest elemendist on suurem; decide which of the two elements is grater
b. salvestada paare "võti-väärtus"; store the "key-value" pairs
c. küsida andmekogumi järgmist elementi; ask the next element of a collection
d. lisada hulka korduvaid elemente, add multiple elements to the set

15. Kogumi elementide süstemaatiliseks läbikäimiseks sobib Java APIs liides:
*a. Iterator    
b. Map    
c. Comparable    
d. Set 

16. Olukorda, milles Java programmi tööd pole otstarbekas jätkata ning mille tekkimist reeglina ka ei töödelda, kirjeldab klass:
Situation when it is not reasonable to continue the execution of a Java program and which in general is not handled by a programmer is described by class:

a. RuntimeException
b. Exception
c. IOException
*d. Error

17. Java algtüüpidesse kuuluvate andmete väljastamiseks on ette nähtud meetodid klassis:
*a. DataOutputStream
b. File
c. FileWriter
d. ByteArrayOutputStream

18. Millist kasutajaliidese aspekti juhib paigutushaldur?
a. liidese mudeli
*b. liidese visuaalne kuju
c. liidese reageerimine sündmustele
d. liidese seos välise keskkonnaga

19. Rakendi elutsükli alguses täidetakse meetod:
a. start
*b. init
c. repaint
d. paint

20. Milline käsk joonistab ringjoone raadiusega 50 pikselit?
a. g.fillOval (50, 50, 50, 50)
b. g.drawOval (50, 50, 50, 50)
*c. g.drawOval (0, 0, 100, 100)
d.








Foorumikraam - kontrollimata, küsimused võivad korduda varasematega




3. Mida tähistab keeles Java järgmine kirjutis? What does the following mean in Java? -0.5e-2f 
    * 32-bitine reaalarv -0.0050 ; 32-bit real number -0.0050


5.Java programmi lähtekood on failis laiendiga:
    *.java
       

11.Java programmi transleerimisel tekkiv baitkood on failis laiendiga
        *class

12. Võtmesõna "while" järele ümarsulgudesse kirjutatav tingimus on... 
        * tsükli jätkamise tingimus
   
 
:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
KT2


33.	Konstruktor on
•	meetod isendi loomiseks
34. 	Javadoc @version abil dokumenteeritakse
•	klassi versiooniinfot
38. 	Millist kasutajaliidese aspekti juhivad kuularid? 
•	liidese visuaalne kuju
39. Rakendi kuva värskendamist saab tellida pöördudes meetodi ... poole. 
•	repaint
42. Java koodistiil nõuab konstantide nimede kirjutamist:
•	SUURTE TÄHTEDEGA JA ALAKRIIPSUDEGA IMHO nt DARK_GRAY


Programmeerimiskeele süntaksit kirjeldab...
a. testide hulk
+ b. grammatika
c. API  Vale
d. IDE

Milline alljärgnevatest keeltest esindab objektorienteeritud programmeerimise paradigmat? 
a. Haskell
b. Ada
c. Prolog Vale
+ d. Smalltalk

Milline alljärgnevatest keeltest esindab imperatiivse programmeerimise paradigmat?
+ a. Ada
b. Haskell
c. Smalltalk
d. Prolog

Milline alljärgnevatest keeltest esindab loogilise programmeerimise paradigmat? 
a. Haskell 
b. Smalltalk 
c. Ada 
+ d. Prolog

Milline järgnevatest tüüpidest EI OLE algtüüp (primitive type)?
a. boolean
b. double
+ c. Long 
d. float

Milline järgnevatest keele Java tüüpidest on algtüüp (primitive type)?
a. Long
+ b. boolean
c. Double
d. Integrer

Mida tähistab keeles Java järgmine kirjutis? -0xa
a. Ei ole Javas lubatud
b. 16-bitine täisarv -10 Vale
c. 32-bitine täisarv -10
d. 64-bitine täisarv -10

Mida tähistab keeles Java järgmine kirjutis?  -0.5e-2 
a. 32-bitine reaalarv -0.005
b. 64-bitine reaalarv -50.00
c. 64-bitine reaalarv -0.05
+ d. 64-bitine reaalarv -0.005 

Mida tähistab keeles Java järgmine kirjutis? -0.5e-2f 
a. 32-bitine reaalarv -0.05 
+ b. 32-bitine reaalarv -0.005
c. 64-bitine reaalarv -0.005
d. 32-bitine reaalarv -50.00

Millise tulemuse annab järgmine programmilõik? 
int a = 9; 
int b = ++a / 5; 
a. a==10 && b==1 
b. a==9 && b==1 
c. a==9 && b==2 
+ d. a==10 && b==2

Millise tulemuse annab järgmine programmilõik? 
[code java]
int a = 4;
int b = a++ / 5;
[/code]
a. a==5 && b==0.8
b. a==4 && b==0
c. a==5 && b==1
+ d. a==5 && b==0 

Mida väljendab alljärgneva programmilõigu teine lause? 
String s = "Hello"; 
int len = s.length(); 
a. klassi String klassimeetodi poole pöördumist 
b. jooksva klassi isendimeetodi poole pöördumist
c. klassi Integer konstruktori poole pöördumist
d. objekti s isendimeetodi poole pöördumist

Milline tingimus kirjeldab n mittekuulumist poollõiku [0, 10) ? 
a. (n >= 0) && (n < 10)
+ b. (n <0) || (n >= 10)
c. (n >=0) || (n < 10)
d. (n < 0) && (n >= 10)

Võtmesõna "while" järele ümarsulgudesse kirjutatav tingimus on... 
a. Java virtuaalmasina peatamise tingimus
b. tsükli lõpetamise tingimus
c. meetodist väljumise tingimus
+ d. tsükli jätkamise tingimus 

Käsu return järele kirjutatud avaldisega määratakse: 
a. tegelikud parameetrid
b. formaalsed parameetrid
c. signatuur
+ d. tagastusväärtus

Java return lause...
a. annab juhtimise tagasi meetodi väljakutsujale
b. tekitab erindi (vea)
c. ei tee midagi (tühilause)
d. väljastab teksti

Meetodi nimi koos piiritlejate, parameetrite tüüpide ning tagastusväärtuse tüübiga on tuntud kui meetodi:
a. tegelikud parameetrid Vale
+ b. signatuur
c. formaalsed parameetrid
d. tagastusväärtus

Java rakendus (application) peab sisaldama meetodit, mille signatuur on... 
a. public static int main (String[] ) 
b. public void main (String ) 
c. public void run() 
+ d. public static void main (String[] )

Millist tüüpi väärtuse tagastab meetod m?
public static int m (double d, String s)
+ a. int
b. double
c. String
d. void

Javadoc @version abil dokumenteeritakse: 
+ a. klassi versiooniinfot
b. meetodi tagastusväärtust
c. meetodi parameetrit
d. meetodi poolt tekitatavaid erindeid

Javadoc @since abil dokumenteeritakse:
a. klassi versiooniinfot
b. hetkel kasutatavat Java kompilaatori versiooni
c. Java versiooni, millest alates seda klassi ei toetata
+ d. varaseimat Java kompilaatori versiooni, millega klass kompileerub

Javadoc @param abil dokumenteeritakse:
+ a.meetodi parameetrit

Java koodistiil nõuab konstantide nimede kirjutamist:
a. ainult suurtähtedega
b. kreeka keeles
c. suure algustähega Vale
+ d. väikese algustähega

Java koodistiil nõuab klassinimede kirjutamist:
+ a.suure algustähega
b. ainult väikeste tähtedega
c. väikese algustähega
d. ainult suurtähtedega

Teate saatmine objektile tähendab:
a. objektile mälu eraldamist
+ b. pöördumist vastava isendimeetodi poole
c. objektile uue stringiesituse määramist
d. pöördumist vastava klassimeetodi poole

Objekti (isendi) identiteedi Javas määrab:
+ a. mäluaadress
b. objekti esitus sõne kujul
c. isendimuut ujate väärtuste hulk
d. klassimuutujate väärtuste hulk

Destruktor on:
a. dünaamilise pikkusega andmestruktuur
+ b. meetod isendi hävitamiseks, keeles Java puudub
c. isendimeetod, mis teisendab objekti stringiks
d. meetod isendi loomiseks

Liides List keeles Java võimaldab: 
a. küsida andmekogumi järgmist elementi
b. salvestada paare "võti-väärtus" Vale
c. otsustada, kumb kahest elemendist on suurem
d. salvestada andmestruktuuri korduvaid elemente, mida eristatakse indeksi järgi

Liides Comparable keeles Java võimaldab:
a. salvestada paare "võti-väärtus"
b. lisada hulka korduvaid elemente
+ c. otsustada, kumb kahest elemendist on suurem
d. küsida andmekogumi järgmist elementi

Java break lause... 
a. annab juhtimise tagasi meetodi väljakutsujale
b. lõpetab Java virtuaalmasina töö
c. lõpetab sisemise tsükli sammu
+ d. lõpetab sisemise tsükli või valikulause täitmise

Paaride "võti - väärtus" salvestamiseks sobib Java APIs klass: 
 a. TreeSet 
b. ArrayList 
+ c. HashMap 
d. Iterator 

Paisktabelit esindab Java APIs liides:
a. Collection
+ b. Map
c. Comparable
d. Set

Millise eriolukorra (loetletutest) tuvastamine ja töötlemine on Javas mõttekas: 
a. ThreadDeath 
+ b. Exception
c. Error 
d. OutOfMemoryError 

Eriolukorda, mille töötlemine programmeerija poolt on Javas kohustuslik, nimetatakse:
+ a. checked exception
b. RuntimeException Vale
c. Error
d. Exception

Baidivoo lugemisel meetodiga read() annab voo lõppemisest märku:
a. (String)null
+ b. (int)-1 
c. (byte)-128
d. (int)0

Millist kasutajaliidese aspekti juhib paigutushaldur?
+ a. liidese visuaalne kuju
b. liidese mudel
c. liidese seos välise keskkonnaga
d. liidese reageerimine sündmustele

Ühene pärimine tähendab, et: 
a. teate poolt aktiviseeritav meetod valitakse programmi lahendamise ajal 
b. teate poolt aktiviseeritav meetod valitakse programmi kompileerimise ajal 
c. klass võib omadusi pärida mitmelt ülemklassilt 
+ d. iga klass saab olla ülimalt ühe klassi alamklass 

Rakendi kuva värskendamist saab tellida pöördudes meetodi ... poole.
a. start
+ b. repaint
c. paint Vale
d. init

Rakendi passiivseks muutumisel pöördutakse meetodi ... poole. 
+ a. stop
b. start 
c. repaint 
d. init 

Rakendi elutsükli alguses täidetakse meetod:
a. start Vale
b. init
c. repaint
d. paint

Milline käsk joonistab ringi (pinna) läbimõõduga 50 pikselit?
a. g.drawOval (50, 50, 50, 50);
b. g.drawOval (0, 0, 100, 100);
c. g.fillOval (0, 0, 100, 100);  Vale
d. g.fillOval (50, 50, 50, 50);

Milline käsk joonistab ringjoone läbimõõduga 50 pikselit? 
a. g.fillOval (50, 50, 50, 50); 
b. g.fillOval (0, 0, 100, 100); 
c. g.drawOval (0, 0, 100, 100); 
+ d. g.drawOval (50, 50, 50, 50);

Milline käsk joonistab ringjoone raadiusega 50 pikselit?
a.g.fillOval (50, 50, 50, 50);
b. g.drawOval (50, 50, 50, 50);
+ c. g.drawOval (0, 0, 100, 100);

Java algtüüpidesse kuuluvate andmete sisestamiseks on ette nähtud meetodid klassis: 
a. DataInputStream 
b. ByteArrayInputStream 
c. File 
d. FileReader Vale

Java algtüüpidesse kuuluvate andmete väljastamimseks on ette nähtud meetodid klassis:
a. FileWriter
b. ByteArrayOutputStream
c. File
+ d. DataOutputStream

Millist kasutajaliidese aspekti juhivad kuularid? 
a.liidese reageerimine sündmustele


Paaride" võti-väärtus" salvesatamiseks sobib Java APIs klass:
a. TreeSet
b. ArrayList
c. HashMap +
d. Iterator

Hiline seostamine tähendab,et 
a.teate poolt aktiviseeritav meetod valib programmi lahendamise ajal
b.klass võib omadusi pärida mitmelt ülemklassilt
c. iga klass saab olla ülimalt ühe klassi alamklass
d.teate poolt aktiviseeritav meetod valitakse programmi kompileerimise ajal +

Isendimuutujate väärtused määravad objekti:
Values of instance variables determine:

1. oleku; object state +
2. identiteedi; object identity
3. klassi; object class
4. käitumise; object behaviour

Korduvate elementideta järjestatud hulka esindab java APIs klass:
a. ArrayList +
b. LinkList
c TreeSet
d. Iteraator

iteraator võimaldab:
a. otsustada, kumb kahest elemendist on suurem
b. salvestada paare"võti-väärtus"'
c.lisada hulka korduvaid elemente
d. küsida andmekogumi järgmist elementi +

Meetodi päises kkirjutatud muutujad on 
a. tagastusväärtus
b. tegelikud väärtused +
c. formaalsed parameetrid
d. siganatuur

Kahe elemendi omavahelise järjestuse määramiseks sobib java APIs liides:
a)Collection
b)Comparable +
c)Map
d)Set

java programmi transleerimisel tekkiv baitkood on failis laiendiga
.class

java continue lause
lõpetab sisemise tsükli sammu

olgu muutuja m kelles Java kirjeldatud kui täisarvude massiiv. Mälu eraldamiseks massiivi m 10 elemendi jaoks tuleb kirjutada:
a. m=new int[10] +
b.m.length=10
c.m[9]=0;
d.m.allocate

Java programmi lähtekood on failis laiendiga?
.java

Millist kasutajaliidese aspekti juhivad kuularid?
a.liidese reageerimine sündmustele

Java algtüüpidesse kuuluvate andmete väljastamimseks on ette nähtud meetodid klassis:
a. FileWriter
b. ByteArrayOutputStream
c. File
d. DataOutputStream +

Java algtüüpidesse kuuluvate andmete sisestamiseks on ette nähtud meetodid klassis: 
a. DataInputStream  +
b. ByteArrayInputStream 
c. File 
d. FileReader

Rakendi elutsükli alguses täidetakse meetod:
a. start 
b. init +
c. repaint
d. paint

*/

