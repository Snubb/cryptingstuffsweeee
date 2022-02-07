# Någon form av krypteringsprogram - postmortem

Oliver Lundqvist - 2022/02/07

## Inledning

Syftet med arbetet var att fortsätta jobba med OOP och MVC-modellen. Arbetet är helt skrivet i java och jobbar enbart med egna lokala filer och använder javas gui swing sak för grafiken.

## Bakgrund

Programmet bestod av huvudsakligen tre delar:
- Att kryptera en text med hjälp av en nyckel.
- Någon form av filhantering för att öppna och spara filer
- Någon grafik att interagera med för att göra användningen av programmet enklare.

Krypteringen gjordes med hjälp av javas XOR metod '^'. Det returnerar en int som sedan helt enkelt gjordes om till läsbara meningar.

Filhanteringen är enbart lokalt med hjälp av filereader, bufferedreader, printwriter etc.

Grafiken är väldigt simpelt gjort med Swing UI ~~som även är omöjlig att få det att se rätt ut med~~.

## Positiva erfarenheter

Att hålla sig till MVC-modellen har gått rätt så bra. Så länge man planerar lite smått vart allting ska hamna innan man skriver det är det inte så svårt att göra det.

## Negativa erfarenheter

Först och främst så glömde jag bort lite gran om att spara ned/läsa filer i binärt format. Är säkert inte jätte svårt, har redan smakat på det lite gran i main.java.

Själva grafiken ser även väldigt äcklig ut men det är inte något jätte stort problem, det skulle bara vara någonting väldigt simpelt till att börja med.

Sättet jag valda att kryptera med använder en new Random(long). Eftersom den kräver en long så måste jag parsea använderans input till long vilket blir problematiskt då det inte verkar fungera med vissa special karaktärer (ex. '('). Det finns säkert något sätt att parsea till long på ett bättre sätt eller bara inte använda Random men är för lat för att ändra det vid det här laget.

## Sammanfattning

Överlag har det gått ganska bra ändå. Programmet har fungerande grafik och kan både öppna och spara filer samt kryptera text.

Kan utvecklas på flera sätt; finare grafik, spara ner binärt, kryptera andra saker utöver txt filer ex. bilder etc.

Det jag lärt mig är mest ett bra sätt att hantera filer som jag säkert kommer gå och kopiera för framtida projekt.
