package com.dilaykarakas.anadolurock;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class DetayActivity extends AppCompatActivity {

    private TextView detayText;
    private ImageView detayImage;
    private String[] detayListe;
    private int[] detayImageListe;
    private String[] detayUrlListe;

    private String pozisyonAnahtari = "pozisyonAnahtari";

    private int detayPozisyon;

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);

        detayText = (TextView) findViewById(R.id.detayTextView);
        detayImage = (ImageView) findViewById(R.id.detayImageView);
        btn=(Button) findViewById (R.id.button);

        detayListe = new String[] {"Barış Manço, aileden gelen yetenekle çocukluğundan beri şarkı söylemeye meraklıydı. İlk grubunu 15 yaşında Galatasaray Lisesi/'nde kurdu. İsmi Kafadarlar olan grupta Asaf Savaş Akad da müzik yapıyordu. Kafadarlar/'dan sonra, Galatasaray Lisesi/'ndeki ikinci grubu Haramiler/'dir. Barış Manço, 20 Eylül 1963/'de liseden mezun olduktan sonra üniversite eğitimi için önce Paris/'e, sonra da Belçika/'ya gitmiştir. \n" +
                "\n" +
                "Manço, 1963-1971 yılları arasında Belçika/'da Lemistgrees adlı bir grup kurar. Amerikalı, Belçikalı, İtalyan, Kuzey Afrikalı ve İngiliz müzisyenlerden oluşan bu grup ile çalışmaları iki yıl sürer. 1965 yılında Paris Olympia/'da konser veren sanatçı, 1966 yılında da Paris/'de 2 adet 45/'lik çıkartmıştır. \n" +
                "\n" +
                "1970/'li yılların başında Türkiye/'ye dönen Manço, Fuat Güner, Mazhar Alanson ile birlikte Kaygısızlar adlı grubu kurdu. O yıllarda Türkiye/'de gelişen aranjman modasına karşı tepki oluşturanlar, Anadolu/'ya yönelik pop folk türünde şarkılar üretiyorlardı. Bu yıllarda Barış Manço, Dağlar Dağlar ile büyük çıkış yaptı. Söz konusu plak, 4-5 ayda 700.000 sattı. Barış Manço, Dağlar Dağlar/'ı Keban/'dan İstanbul/'a giderken otobüste dağlara bakarak bestelediğini söylemektedir. Dağlar Dağlar, Barış Manço/'nun 10. plağıdır. Sanatçı/'nın daha önceden çıkardığı Kars, Antalya ve Karadeniz türkülerinden oluşan plakları vardır. Manço, 1971 yılında Dağlar Dağlar ile Altın plak ödülünü Öztürk Serengil/'in elinden almıştır. \n" +
                "\n" +
                "Bu yıllar aynı zamanda Barış Manço/'nun görüntüsünün oturduğu yıllardır. Barış Manço/'nun saçları uzundur, uzun otantik kıyafetler giyer, yüzükleri, bilezikleri ve kemerleri vazgeçilmez aksesuarlarıdır. O, hepimizden farklıdır; ayrıca en büyük ayrıcalığı, şarkılarını söylerken sürekli ellerini kullanmasıdır. 1970 yıllarında Manço-Moğol ortaklığı kurulur ancak bir yıl süreyle birlikte çalışırlar. 1971 yılı başlarında, Kurtalan Ekspres/'i kuran Manço, aynı yılın Mayıs ayında askere gider ve Polatlı Topçu Okulu/'nda topçu asteğmen olarak askerliğini yaparken müzik dünyasından da kopmamaya çalışır. Adını İstanbul/'dan Güneydoğu/'ya giden trenden alan Kurtalan Ekspres/'in o yıllardaki kadrosunu Murat Ses, Nur Moray, Celal Güven, Özkan Uğur ve Engin Yörükoğlu oluşturmaktadır. Daha sonra Engin Yörükoğlu ayrılır yerine Caner Bora, Özkan Uğur/'un yerine ise Ahmet Güvenç katılır. \n" +
                "\n" +
                "1974 yılında tekrar 3 yıl süre ile Belçika/'da yaşayan Barış Manço, İngiltere/'de long play çıkarmıştır. 1977 yılında Kurtalan Ekspres/'in kadrosuna; Bahadır Akkuzu, Kılıç Danışman ve Oktay Aldoğan katılmıştır. 1981 yılında Oktay Aldoğan ayrılmış; yerine Serdar Ertürk ve Serdar Akatlar gelmiştir. Barış Manço, 1979 yılında \"Yeni Bir Gün\" adlı şarkısı ile yılın erkek sanatçısı ünvanını kazanmıştır. Bu şarkı ayrıca yılın bestecisi, yılın albümü ve yılın düzenlemesi ödüllerini de almışır. \n" +
                "\n" +
                "1979 yılında Kurtalan Ekspres ile Anadolu turneleri sürerken, yurt dışında da televizyon programları yapar. 1980 yılında Altın Orfe/'de Nick The Copper adlı şarkı ve \"Ben Bir Şarkıyım\" adlı Bulgar şarkısı ile altın madalya alır. 1981/'de \"Sözüm Meclisten Dışarı\" der, 28-29 Ekim 1982 tarihlerinde Almanya, Avusturya, İsviçre, Belçika ve Hollanda/'da televizyon programlarına çıkar. 1982 yılında önce Anadolu turnesi, daha sonra da Amerika konserleri ile büyük başarı elde eder. 1983 yılında Türk pop müziği dalında yılın sanatçısı seçilen Manço, 1983 yılında İsveç Stockholm/'da bir konser, 3 radyo programı, 1 televizyon programı gerçekleştirdi. 1983 yılında Eurovision/'a Kazma adlı parça ile katıldı, ancak elendi. Barış Manço, aynı yıl, \"Estağfurullah Ne Haddimize\" diyerek mütevazi davranmasına karşı olarak, 1984 yılında, \"24 Ayar Manço\" diyerek değerini ortaya koymuştur. 1984 yılında ise 3 parça ile katıldığı Eurovision şarkı yarışmasından finale kaldıktan sonra çekilir. \n" +
                "\n" +
                "15 Kasım 1984/'de Almanya turnesi yaptı. 1985 yılında TRT için 30 Ağustos/'da yayınlanacak solo programı, Ankara Seymenler Parkı/'nda çekildi. Bu programda ilk kez hafızalı bilgisayar kullanıldı ve yine ilk kez bu konserde smokin giydi. 1985 yılı 17 Kasım/'da İstanbul Şan Tiyatrosu/'nda konser verdi. Bu arada Sinan Çetin/'in yönettiği \"14 Numara\" adlı sinema filmi için film müziği yaptı. Aynı yıl Ankara/'da, Ankara/'nın başkent oluşunun yıldönümü kutlamaları nedeniyle bir gençlik konseri verdi. Belçika/'da bir gazete, Barış Manço/'yu, Türkiye/'de Belçika/'nın reklamını yaptığı için \"müzik elçisi\" ilan etti. \n" +
                "\n" +
                "Barış Manço, 1989 yılında Sezen Aksu ile birlikte en başarılı pop müzik sanatçısı seçildi. 16 Haziran 1990 tarihinde, Yugoslavya/'da Kosova halk şarkıları festivaline katıldı. 20 Haziranda ise Leningrad/'daki Kurtalan Ekspres; Özlem Yüksek, Yeşim Vatan ve Ufuk Yıldırım/'dan oluşan vokal grubu ile birlikte ünlü rock gruplarının katıldığı \"White Night\" adlı rock festivaline katıldı. Barış Manço bu festivalde Kara Sevda ve Gülpembe/'nin içerisinde olduğu 5 şarkı seslendirmiştir. Barış Manço bu festival ile ilgili yaptığı açıklamada müzik türünü, kökeninde hard rock ve heavy metal olmasına rağmen \"Ağır Türk Müziği\" diye adlandırmaktadır. Bu arada Sovyetler Birliği/'nde Kara Sevda ve Domates Biber Patlıcan klipleri ilgi görmektedir. Aynı yıl, Kurtalan Ekspres ile birlikte Japon-Türk ilişkilerinin 100.yılı kutlamaları için konser vermiştir. \n" +
                "\n" +
                "Barış Manço/'nun, Türk Pop Müziği tarihinde şarkıları dramatize edenlerin en önünde gelmesiyle de belli bir yeri vardır. 1973 yılında henüz Türkiye/'de \"video klip\" diye bir kavram yokken, ilk klibini \"Hey Koca Topçu\" parçası için çekmiştir. Bu klipte, Kurtalan Ekspres, Asaki-i Mansure-i Muhammediye Tayfası olarak Yeniçerileriler kimliği ile, Mehter kıyafetleri giymiştir. Barış Manço ise, Mühedishane-i devri Hümayundan Mülazim-ı Evvel Barış Efendi olarak asker kıyafetiyle yer almıştır... \n" +
                "\n" +
                "Barış Manço, 1970/'lerde 2000 yıllarını düşleyerek müzik yapmıştı. 2023 buna örnek bir parçadır. 1973 yılında yazılan şarkıya \"2023\" adının verilmesinin asıl nedeni, Cumhuriyetin 100. yıldönümünün 2023 yılına denk gelmesidir. Barış Manço/'nun düşü, bu şarkıyı 2023 yılında bir senfoni orkestrası eşliğinde seslendirmekti. Barış Manço konuyla ilgili olarak şu ifadeleri kullanmıştır: \"80 yaşımdayken elimde bastonum, belki kolumda oğlum Doğukan, onun yardımıyla çıkarım sahneye ve senfoni orkestrasına 2023 çaldırmak en büyük ideallerimden biri olsa gerek.\"", "24 Haziran 1941 tarihinde İstanbul'da doğdu. Küçük yaşlarda, piyano öğretmeni olan annesi Vecihe Koray'dan piyano öğrendi, daha sonra gitar çalmaya başladı. İstanbul Alman Lisesi'nde eğitim gördüğü '50'li yılların ikinci yarısında , arkadaşları ile kurduğu amatör topluluk olan Erkin Koray ve Ritimcileri ile dönemin güncel parçalarını çalmaya başladı. Lise eğitiminin ardından '60'lı yılların başına dek çalışmalarını yarı amatör yarı profesyonel olarak sürdürdü.\n" +
                "\n" +
                "1959 yılında ilk grubu Erkin Koray Ve Ritimcileri'ni kurdu. 1962 yılında çeşitli müzikli mekânlarda programlar yaptığı sıralarda aldığı bir teklif ile bir yüzünde Bir Eylül Akşamı, diğer yüzünde It's So Long adlı İngilizce parça bulunan ilk 45'liğini kaydetti. Ancak bu plak 1966 yılında piyasaya çıktı. Erkin Koray askerliğini 1963-1965 yılları arasında Ankara'da Hava Kuvvetleri Caz Orkestrası'nda Solist ve Gitarist olarak yaptı.\n" +
                "\n" +
                "Terhisi sonrasında Almanya'nın Hamburg şehrine giden Erkin Koray 1966 yılında Türkiye'ye dönüşünden sonra Erkin Koray Dörtlüsü adlı grubu kurdu. 1967 yılında basılan, bir yüzünde \"Kızları da Alın Askere\", diğer yüzünde \"Aşk Oyunu\" adlı parçalar bulunan 45'liği ile önemli başarı kazandı. Özellikle \"Kızları da Alın Askere\" parçası Erkin Koray'ın geniş kitleler tarafından tanınmasında önemli rol oynamıştır.\n" +
                "\n" +
                "1968 yılında, Hürriyet Gazetesi tarafından yapılan \"Altın Mikrofon\" yarışmasına katıldı. Bu yarışmada 4. olan Erkin Koray'ın yarışmadaki şarkıları \"Meçhul\" ve \"Çiçek Dağı\" daha sonra bir plak şirketi tarafından piyasaya çıkarılarak 800 bin adet gibi büyük tiraj yaptı. Grubu ile bir yandan konser verdi, bir yandan da Klüp, Bar gibi çeşitli müzikli mekânlarda çalışmaya devam etti.\n" +
                "\n" +
                "Bu ilk önemli başarıyı, 60'lı yılların sonlarına dek ardı ardına gelen: \"Anma Arkadaş\", \"Hop Hop Gelsin\", \"Sana Bir Şeyler Olmuş\", \"Seni Her Gördüğümde\" gibi hepsi büyük beğeni toplayan parçalar takip etmiştir.\n" +
                "\n" +
                "1969 yılında kurduğu Yeraltı Dörtlüsü adlı grubu ile Türkiye'de ilk \"Underground\" müzik akımının öncüsü oldu. 70'li yılların başlarına gelindiğinde Koray Türkiye'de oldukça geniş bir dinleyici kitlesine sahiptir ve kendine özgü müzik çizgisi belirginleşmiş durumdadır.\n" +
                "1971'de Erkin Koray Süper Grup, 1972'de Ter gruplarını kuran Koray , 1970-1974 yılları arasında Türkiye müzik listelerinde üst sıralarda yer alan klasikleşmiş birçok esere imza atmıştır. \"İlahi Morluk\", \"Aşka İnanmıyorum\", \"Mesafeler\", \"Züleyha\", \"Silinmeyen Hatıralar\", 1974'te \"Şaşkın\", \"Fesuphanallah\" bu dönem eserlerindendir.\n" +
                "\n" +
                "Erkin Koray 1974-1984 yılları arasında kısa sürelerle Türkiye'ye gelişleri dışında Hollanda, Almanya ve Kanada'da yaşadı. Hakkında pek fazla bilgi olmayan bu dönemde, \"Estarabim\", \"Arap Saçı\" gibi çok bilinen eserleri yayımladı. Koray 1977 yılında kurduğu Erkin Koray Tutkusu adlı LP ve aynı adlı gruptan sonra, kısa süreli beraberlikler dışında başka grup kurmamıştır.\n" +
                "\n" +
                "1980'ler\n" +
                "Erkin Koray, 1982'de Benden Sana albümünü yayınladı. Albümün bir kısmını Almanya'da Köln ve Hamburg'da kaydederken bir kısmını da İstanbul'da kaydetti. Albümde Koray'a, Haluk Taşoğlu ve Sedat Avcı'nın yanı sıra Hint müzisyen Harpal Singh de destek verdi. Albümdeki şarkıların bir kısmı (Meyhanede, Öyle Bir Geçer, Sayın Arkadaşım Osman) Hint müzisyenlerin bestelerine Erkin Koray'ın Türkçe yazdığı sözlerden oluşur.\n" +
                "\n" +
                "Bir sene sonra ise İlla Ki albümünü yayınladı. Bu albüm içindeki şarkılar kadar, Nuri Kurtcebe'nin çizdiği albüm kapağı ve plak versiyonunun şeffaf olmasıyla da dikkat çekiyordu. Miksajı Köln'de yapılan albümde İlla Ki, Deli Kadın, Tek Başına gibi hit şarkıların yanında Kızları da Alın Askere ve Hop Hop Gelsin gibi eski şarkıların da yeni yorumları yer alıyordu.\n" +
                "\n" +
                "Türkiye'ye kesin dönüşünün ardından, ailevi sorunlarından dolayı kendisi için pek verimli geçmeyen 1985-1990 yılları arasında belki en çok bilinen çalışması olan Çöpçüler ile büyük bir çıkış yaptı. Çöpçüler'in de yer aldığı Ceylan 1985'te yayınlandı. Albümde Erkin Koray, çoğu enstrümanı kendi çalmıştı. Bu dönemde, devrin modasına uyarak piyanist-şarkıcı olarak bir restoranda müzik yapmaya başladı; nedeni olarak da \"para kazanması gerektiği\" olduğunu belirtti.\n" +
                "\n" +
                "Bu dönemin diğer bir önemli ve özgün eserlerinden biri de 1986'da yayınlanan Gaddar albümü oldu. Anılan maddi sıkıntılar, sanatçıyı tek bir sentezleyici eşliğinde kaydedilen Çukulatam Benim (1987) gibi düşük bütçeli yapımlara zorlamıştır. Bu albümde de Şaşkın ve Sana Bir Şeyler Olmuş şarkılarının taverna müziği tadındaki yorumları bulunmaktaydı. 1989'da Hay Yam Yam albümü çıktı. Bu albümde klip çektiği Hayat Katarı şarkısı Kemal Sunal filmi Abuk Subuk Bir Film filminde kullanılmıştı. 1990 yılında yayınladığı Tamam Artık albümü de önceki albümlerinden farklı olmayan bir şekilde eski ve yeni şarkıların karışık bulunduğu bir albüm oldu.\n" +
                "\n" +
                "Erkin Koray'ın hayatı genellikle ekonomik sıkıntılarla geçmiştir. Yaptığı çıkışlar, son derece popüler olan çalışmaları onu maddi açıdan rahatlatmaya yetmemiştir. Müziği kendine yaşam biçimi olarak seçmiş olan Koray ve dönemdaşı birçok özgün sanatçı, o dönemlerde belirsiz olan telif hakları, sınırlı çalışma olanakları, sağlıksız bir yapıya sahip olan müzik piyasası ve müzik dinleyicisinin düşük alım gücü gibi nedenlerle bu sıkıntılardan kurtulamamışlardır. Bunlardan bazıları küserek müziği bırakmışlar ve daha iyi maddi koşullar elde edebilecekleri işler ile uğraşmışlardır. Erkin Koray telif hakları en çok ihlal edilmiş sanatçılarımızdan biri olmuştur. Bu nedenlerle nerede ise hiçbir zaman arzu ettiği yapımları gerçekleştirecek parasal kaynak bulamamıştır.\n" +
                "\n" +
                "Yenilikçi, sentezci, deneyci bir müzik çizgisi olan Erkin Koray; sıradışı şarkı sözleri, kendine özgü vokal biçemi, uzun saçları, özgün kıyafetleri ve bunun gibi daha birçok nedenle dönemin yayın tekeli olan Türkiye Radyo Televizyon Kurumu TRT tarafından dışlanmıştır. Eserlerinin nerede ise tamamı yakın zamanlara kadar, TRT denetimi tarafından yayımlanmaya uygun görülmemiştir. Bu durum Türkiye'de özel yayın kuruluşlarının ortaya çıkışına kadar süregelmiş ve Koray'ın dinleyici kitlesinin sınırlı kalmasına yol açmıştır.\n" +
                "\n" +
                "1990'lar\n" +
                "1990 - 1993 yıllarında, genelde Öyle Bir Geçer, Arapsaçı, Fesupanallah, Şaşkın, Sevince ve Yalnızlar Rıhtımı vb. hitleri içeren bir toplama albüm serisi ve bir de Best Of piyasaya sürdü. 1990'da yayınladığı Tamam Artık albümünden sonra bir sessizlik ve plak şirketlerine küskünlük dönemine giren sanatçı, 1991'de Tek Başına Konser adlı konser kayıtlarından oluşan dışında albüm çalışmalarına ara verdi.\n" +
                "\n" +
                "1996 yılına kadar süren bu sessizlik, iddialı ve görece yüksek bütçeli Gün Ola Harman Ola albümü ile bozulmuştur. Eleştirmenlerce olumlu eleştiriler alan bu çalışmayı 1999 yılında yayımlanan Devlerin Nefesi adlı son albümü takip etmiştir.","Kuruluş ve İlk Yıllar\n" +
                "\n" +
                "Grubun kullanmakta olduğu logosu\n" +
                "1967'de Silüetler'de çalışan Aziz Azmet, Tahir Nejat Özyılmazel, Murat Ses ve Aydın Daruga Vahşi Kediler grubunun basçısı Haluk Kunt'la birlikte grubu kurarlar. Kısa bir süre (yaklaşık 2 ay) sonra Selçuk Alagöz grubunda çalışan Cahit Berkay gruba katılır ve Tahir Nejat Özyılmazel gruptan ayrılır. Kısa bir süre sonra yine bir ara Selçuk Alagöz grubunda çalışmış olan ve Almanya’da Cem Karaca Apaşlarla yaptığı turneden dönen Hasan Sel Haluk Kunt'un yerini alır. İlk 45'likleri \"Eastern Love/Artık Çok Geç\", Şubat 68'de çıkar. Bu dönemdeki parçalarda Azmet/Ses ikilisinin, Lennon/McCartney tarzı bir çalışma beraberliği sözkonusudur. Benzeri tonaliteye, bu ikilinin Silüetler döneminde, hatta Meteorlar döneminde rastlamak mümkündür. Bu plağın hemen ardından \"Mektup/Lazy John\"u yapan grup, Haziranda Altın Mikrofon yarışmasına katılır ve \"Ilgaz\" üçüncü olur.\n" +
                "\n" +
                "Bu başarı ve ardından çıkan 45'lik Moğollar adının daha çok insan tarafından duyulmasını sağlar. Konserler verirler. İlginç konserlerdir bunlar; örneğin: Diskotek dergisi tarafından 3 Nisan 1968'de İstanbul Fitaş sineması'nda düzenlenen, Haramiler ve Kaygısızların da katıldığı konsere \"silindir şapkaları, uzun siyah frakları ile üç keman bir viyolonsel ve bir trompet eşliğinde\" çıkar Moğollar elemanları. İlk solo konserlerini ise 19 Ekim 1968'de İstanbul Fitaş Sineması'nda verirler. Yabancı şarkıların yanı sıra kendi bestelerini de seslendiren Moğollar, konserlerinde büyük ilgi görür. Ünleri İstanbul dışına çıkar, Anadolu'ya ulaşır. Aynı tarihlerde dördüncü plaklarını çıkaran Moğollar 1968'i tanınmış bir grup olarak kapatır.\n" +
                "\n" +
                "Anadolu Pop Dönemi\n" +
                "1969 yılının Şubat ayında grupta bir eleman değişimi yaşanır. Aydın Daruga gruptan ayrılır, yerini Selçuk Alagöz grubunun eski davulcusu Engin Yörükoğlu alır. Moğollar 1969 yılını, neredeyse tüm Türkiye’yi kapsayan büyük bir turneyle geçirir. Bu turne sırasında yaşadıkları onların müziğinde önemli bir değişime neden olur. Turne öncesinde İstanbul'da verdikleri konserlerde kimi türkü düzenlemeleri ve halk müziği sazlarını kullanmaları ilgi görür, fakat bu turne Moğollar'ın Anadoluyu yakından tanımalarını sağlar, bu da onların tarzlarının daha belirginleşmesini gerçekleştirir ve Moğollar bu tarza bir isim verirler: Anadolu Pop. Hey dergisine bu adı seçmelerinin nedenini ve amaçlarını şöyle açıklarlar: \"...ispatlamak istediğimiz, halk müziğimizin çok sesli bir ruha sahip olması. Ayrıca folklorumuzdaki dinamizmin pop müziğin dinamiğine yakın olması. Geri kalmış popüler müziğimizin ileri teknik ve zengin folklorumuzla birleşmesiyle bir kişilik kazanması...\"\n" +
                "\n" +
                "Moğollar, bu açıklamayı yaptıkları tarihlerde, Anadolu Pop'un yalnızca düzenlemelerden ibaret olmadığını ve bu tarzda beste de yapılabileceğini kanıtlamak için bir 45'lik çıkarırlar: \"Dağ ve Çocuk/İmece\". Her iki parça da yerli melodi ve ritimlerden yola çıkılarak yapılmış bestelerdir, büyük ilgi görür. Böylece Moğollar, Anadolu Pop'un yaratıcıları, \"Dağ ve Çocuk\" da bestelenmiş ilk Anadolu Pop hiti olarak tarihteki yerini alır. 1970'in başında Hasan Sel ayrılır, yerine daha önce Erkin Koray dörtlüsünde bas çalan Taner Öngür gelir. Daha sonra, Murat Ses'in tipik zurna biçemli org soloları ile Moğollar, aynı çizgide yollarına devam ederler (Garip Çoban ve diğerleri). Temmuz 1970'te bir eleman değişikliği daha yaşanır, Aziz Azmet gruptan ayrılıp solo çalışmaya başlar. Ayrıca önce Bunalımlar, sonra o sıralarda yeni isim yapmaya başlayan Üç Hürel ile bir süre çalışır. Aziz Azmet'in ayrılışının nedeni grubun türkülerle fazla içli dışlı olmasına muhalefet etmesi ve başka arayışlar içerisine girmesiydi. 1972'de son 45'liğini çıkaran Aziz Azmet, 70'lerin ortalarında iş hayatına atıldı ve mali müşavirlik yapmaya başladı. 2006'da \"Son Osmanlı\" filminde rol alan Azmet, İz Tv'de yayınlanan \"Müzikte Bir Deney: Anadolu Rock\" belgeseline de katkıda bulundu. Aziz Azmet'in ayrılışı üzerine Ersen gruba katılır. Ersen'le \"Ternek\" 45'liğini yaparlar, ancak bu birliktelik uzun sürmez. 1970 Ağustos sonunda, Moğollar Ersen'den ayrılır ve Paris'e gider.\n" +
                "\n" +
                "Yurt dışı Dönemi ve Ağrı Dağı Efsanesi\n" +
                "Paris'te Moğollar, CBS firması ile üç yıllık bir anlaşma imzalar ve Murat Ses'in bestelerinden oluşan bir 45'lik \"Behind the dark/Hitchin\" yaparlar (bu plak Türkiye'de İngilizce olarak listebaşı olur). Ayrıca <Guild international du disque> isimli bir plak şirketine de bir albüm yaparlar. Bu albüm \"Danses et Rythmes de la Turquie-d'Hier d'Aujourd'hui\" 1971 yılında Academie Charles Cros büyük plak ödülünü alır. Bu ödülü bir önceki yıl Jimi Hendrix, bir sonraki yıl Pink Floyd kazanmıştır. Adı geçen plaktaki bestelerin ve gelenekselden düzenlemelerin tamamına yakını Murat Ses'in kaleminden çıkmıştır. (Kaynak: SACEM-Fransa ve MESAM-Türkiye). Bu dönemden kalan en önemli Murat Ses bestesi, \"Ağrı Dağı Efsanesi\"dir. Konserlerde zaman zaman 10-15 dakika kadar süren bu parçada Murat Ses'in uzun org improvizasyonlari dikkat çeker. Bu arada Moğollar Paris'te o tarihlerde Belçika'da yaşamakta olan Barış Manço ile karşılaşırlar ve onunla çalışmaya başlarlar. Kurdukları birlikteliğe \"ManchoMongol\" adını verirler. Barış Manço, bu konuda Hey dergisine şunları söyler o tarihlerde: \"Artık biz bir bütünüz. Ne ben Moğollar'ın şarkıcısıyım, ne de onlar benim grubum. Yepyeni bir grup olduk. Adımız MançoMongol. Kafaca anlaşan, aynı fikir seviyesine gelmiş olan bizler, yaptıklarımızın daha iyi olması için, sesimizi bütün dünyaya kuvvetlice duyurabilmek için, başbaşa vermenin zamanı geldiğini anladık.\" Ancak bu böyle olmaz. Birlikte Türkiyeye dönen Barış Manço ve Moğollar, dört ay değişik yörelerde konserler verdikten sonra ayrılır. Geriye beraber yaptıkları iki 45'lik plak kalır. Bu arada Moğollar'ın Paris'te doldurdukları albüm Mart 1971'de Academie Charles Cross ödülünü alır. Türkiyede büyük yankısı olur bu ödülün. Örneğin Hürriyet gazetesi tam sayfa olarak duyurur bu haberi: \"Moğollar'ın davul ve zurna ile doldurduğu plak Akademi armağanı aldı.\"\n" +
                "\n" +
                "Aynı tarihlerde, yine Paris'te CBS firmasından çıkan söz ve müzikleri Murat Ses'e ait 45'lik \"Behind the Dark/Hitchin\" şöyle sunulur dinleyiciye: \"Pikabınızın kolunu plağın üstüne koyup dinlemeye başladığınız anda Doğu'dan gelen bir grubun varlığını anlayacaksınız. Moğollar, bir çeşit 'sitar' olan 'bağlama'yı pop müziğine iyi uygulamaları ile dikkati çekiyor. Öğütleyebileceğimiz tek şey, yalnızca Türklerin bildiği bu ritmin akışına, sihirine kendinizi bırakmanız.\"\n" +
                "\n" +
                "Gruptan Eksilenler ve Namus Belası\n" +
                "Barış Manço'dan ayrıldıktan sonra tekrar Paris'e dönen Moğollar, bu kez Engin Yörükoğlu'nu orada bırakarak Türkiye'ye döner. Yörükoğlu ani bir kararla, 31 Temmuz 1971'de Dominique Meraud ile evlenerek Paris'e yerleşir. Bu beklenmedik ayrılık Mavi Işıklar'ın davulcusu Ayzer Danga ile telafi edilmeye çalışılır, bir sene bu formatta gider. \"Alageyik Destanı/Moğol Halayı\" ve \"Cigrik/Sila\" 45'liği bu dönemde yapılır. Ancak Ağustos 1972'de Murat Ses gruptan ayrılır. Bu arada Selda ile bir 45'lik yapar Moğollar. Daha sonra Ersen gruba yeniden katılır.\n" +
                "\n" +
                "Aralık 1972'de ilginç bir olay yaşanır: Cem Karaca ile çalışan Kardaşlar, Ersen ile çalışan Moğollar solistlerini değişirler. Bu görülmedik olay Moğolların tekrar gündeme gelmesini sağlar. Cem Karaca ve Moğollar güçlü bir birliktelik oluşturmuş ve uzun sürecek bir dostluğun temeli atılmış olur. Çeşitli konser turneleri ve plak çalışmalarıyla geçen iki senelik bir zaman sonunda bu defa Taner Öngür ile Ayzer Danga Moğollar'dan ayrılır. Eskilerden bir tek Cahit Berkay kalmıştır. Bu arada Cem Karaca ve Moğollar'ın en önemli parçalarından biri \"Namus Belası\" çıkar piyasaya. Bir süre sonra Cahit Berkay Moğollar'ı dağıtıp Fransa'ya gider orada Engin Yörükoğlu ile buluşur, yanlarına katılan çeşitli müzisyenlerle Moğollar adı altında iki albüm ve Ali Rıza Binboğa'yla birlikte bir 45'lik yaparlar. 1974 sonu ile 1976 yılları arasında Cahit Berkay ve Engin Yörükoğlunun sürdürdüğü Moğollar 1976'da, aralarına katılan müzisyen Oğuz Abadan'ın da Türkiye'ye geri dönmesiyle çalışmalarına son verir. Bu dönemden kalan en önemli albüm, Fransa'da RCA firmasından çıkan Hitit Sun Türkiye'deki adı Düm-Tek olan albümde, Cahit Berkay'ın enstrümental besteleri Anadolu Rock'tan Jazz Rock'a doğru yönelmeyi işaretlemektedir.\n" +
                "\n" +
                "Grubun Dağılması\n" +
                "1976'dan sonra yalnızca bireysel çalışmalarını sürdürür 'Çekirdek' Moğollar elemanları. Cahit Berkay, film müzikleri yapar aradaki yıllarda. '90'larda, Cem Karaca ve Uğur Dikmen'le Rock kumpanyası adlı grubu kurar, birlikte iki albüm (Yiyin Efendiler ve Nerde Kalmıştık)yaparlar. Engin Yörükoğlu, Fransada çeşitli jazz grupları kurar, sonraları İstanbul'da Jazz Stop isimli bir kulüp açarak orada çalmaya başlar. Taner Öngür ise Dostlar (Edip Akbayram'ın eski grubu), Dadaşlar (Ersen'in 1974-1993 arasında çalıştığı grup) ve Dervişan (Cem Karaca'nın eski grubu)'da çalışır bir süre. Daha sonra Almanya'ya yerleşir. 1992'de Türkiye'ye döner, \"Alarm\" isimli ilk solo albümünü çıkartır.\n" +
                "\n" +
                "Murat Ses, Kurtalan Ekspres'le çalışır, bir ara kısa sürelerle Dostlar ve Dervişan'la çalışır, o dönemden kalan en önemli parça, Dostlar'la yapmış olduğu \"Garip\"tir. Daha sonra, kendi grubu Ağrı Dağı Efsanesini kurar. 1979'dan itibaren Avusturya'ya yerleşen Ses, halen orada ve ABD'de yaşamaktadır. Avusturya'da ve ABD'de, bu güne kadar sekiz solo albüm çıkarmıştır: Automaton (1990), Binfen (1995), Culduz (1999), Automaton Square (2005), Binfen 2005 Remix (2005), Electric Levantine (2006), Umami (2007) ve Beside The Sun (2010).\n" +
                "\n" +
                "Grubun Tekrar Bir Araya Gelişi\n" +
                "1992'de bir televizyon programında dinlediği Moğollar'dan etkilenen Leman dergisi çizerlerinden Kaan Ertem, \"Moğollar tekrar bir araya gelsin\" çağrısıyla bir imza kampanyası açar. u kampanya dahilinde 4000'den fazla imza toplanır. Cahit Berkay, Taner Öngür ve Engin Yörükoğlu arada bir araya gelip bu konuyu görüşürler, yeniden Moğollar'ı kurmak konusunda tereddütleri vardır, ancak kampanyaya gelen mektuplar onlara cesaret verir. Yanlarına genç bir müzisyen Serhat Ersöz'ü alarak, 31 Mayıs 1993'te İstanbul Cemal Reşit Rey konser salonunda verdikleri muhteşem bir konserle geri dönerler. 1994'te \"Moğollar '94\", 1996'da \"Dört Renk\", 1998'de \"30. Yıl\", 2000'de \"Moğollar 1968-2000\" ve 2004'te \"Yürüdük Durmadan\" albümlerini çıkarırlar. 2007 yılında Cem Karaca'nın oğlu Emrah Karaca solist olarak gruba katılır. 2008'de Utku Ünal albüm çalışmaları için 2. davulcu olarak gruba katıldı ve grup 2009'da \"Umut Yolunu Bulur\" albümünü çıkardı. Utku Ünal işlerinin yoğunluğundan ötürü yerini Kemal Küçükbakkal'a bırakmıştır. \"Moğollar '94\" albümündeki Issızlığın Ortasında şarkısı, Sivas Katliamı'nda yaşamını yitirenlere ithaf edilmiştir.","Nejat Yavaşoğulları, genç yaşta müziğe başlayarak üniversite yılları döneminde çeşitli gruplar ile çalışması neticesinde 1984 senesinde adını Mümtaz Soysal'ın bir makalesinin başlığından alarak Bulutsuzluk Özlemi'ni kurmuş ve 1986 yılında ilk albümünü çıkarmıştır.\n" +
                "\n" +
                "Türkiye'nin önde gelen rock grupları arasında yer almaktadır. Döneminin ilk ve erken örneklerinden biri olan Bulutsuzluk Özlemi, çoğunlukla söz ve müzikleri Nejat Yavaşoğulları'nın yönetiminde \"protest müzik\" yapmışlardır. 1990'lardaki çalışmaları ile Türkiye'deki rock müziğinin gelişimine olanak sağlayan Bulutsuzluk Özlemi, kendi türlerinin de ilklerinden biridir.\n" +
                "\n" +
                "Grupta Nejat Yavaşoğulları, Sina Koloğlu, Akın Eldes, Sunay Özgür, Utku Ünal, Deniz Demiröz, Berke Özgümüş, Burak Güven, Serdar Öztop, Kanöz Ozan gibi müzisyenler yer almıştır.\n" +
                "\n" +
                "Irak Savaşı sırasında Nejat Yavaşoğulları'nın gitarının üzerindeki \"Savaşa Hayır\" yazısı Powertürk TV kanalı tarafından silikleştirilmiştir. Söz konusu kanalda sonra yayından da kaldırılan klip, gelen tepkiler üzerine sansürsüz olarak tekrar yayınlanmıştır.\n" +
                "\n" +
                "Grup halen aktif olarak stüdyo çalışmaları, albüm kayıtları, canlı konserler ve sahne gösterimleri yapmakta, aynı zamanda sosyal ve politik gündem maddeleri ile de yakından ilgilenmektedir.\n" +
                "\n" +
                "Üyeler\n" +
                "Güncel üyeler\n" +
                "Nejat Yavaşoğulları-Vokal Gitar\n" +
                "Gencay Kıymaz-davul\n" +
                "Sunay Özgür-Bas gitar\n" +
                "Sina Koloğlu-Klavye\n" +
                "Deniz Demiröz-solo gitar\n" +
                "\n" +
                "Eski üyeler\n" +
                "Ozan Kanöz-Bass, Vokal\n" +
                "Akın Eldes-Elektronik Gitar\n" +
                "Filip Sümbülkaya-Davul\n" +
                "Richard Hames-Alto Saksafon\n" +
                "Demirhan Baylan-Bass\n" +
                "Murat Tükenmez-Bass\n" +
                "Cihangir Bıyıkoğlu Davul\n" +
                "Utku Ünal Davul\n" +
                "Burak Güven -Bass\n" +
                "Süleyman Bağcıoğlu-Elektronik Gitar\n" +
                "Serdar Öztop-Elektronik Gitar", "Müzik kariyeri\n" +
                "İlk yılları\n" +
                "1962'ye girerken Beyoğlu Spor Kulübü'nde arkadaşlarının isteği üzerine şarkı söyledi. Arkadaşları ile sahne alan Karaca, daha sonra grup kurmaya karar verir. Gruba o dönemin ünlü sanatçılarından İlham Gencer destek oldu. Cem Karaca'nin ilk grubu 1963'te Dinamikler oldu. Seslendirme sanatçısı Fikri Çöze'nin jübile konserinde performans sergilediler. Babası hâlâ Karaca'nın müzik yapmasına karşıydı. Hatta adam tutup konserlerde onu yuhalatmıştı ancak Karaca bunlara rağmen müziği bırakmadı. Grup olarak Elvis Presley gibi ünlü rock and roll sanatçılarının klasiklerini yorumluyorlardı. 1963'ün sonunda grup dağıldı.\n" +
                "\n" +
                "Kısa bir süre \"Cem Karaca ve Bekledikleriniz\" adlı bir grupta çaldı. Bu gruptan kısa bir süre sonra ise Gökçen Kaynatan'ın orkestrasında çaldı ancak bu beraberlik de uzun sürmedi. Aynı sene \"Cem Karaca ve Jaguarlar\" kuruldu. 1965'te Altın Mikrofon yarışmasına başvurdular ancak ön elemeyi geçemediler.\n" +
                "\n" +
                "Karaca, 1965'te ilk evliliğini tiyatro sanatçısı Semra Özgür ile yaptı. Evlendikten 3 gün sonra Karaca, askere gitti. Askerliğine 1965 Kasım'ında Antakya 121. Jandarma Er Eğitim Alayı'nda başladı. Bu dönemde Karaca, Anadolu kültürünü tanımaya başladı. Aşık Mahzuni Şerif ile tanıştı.\n" +
                "\n" +
                "Apaşlar dönemi\n" +
                "Cem Karaca, askerlik sonrası Şubat 1967'de gitarist Mehmet Soyarslan'ın kurduğu Apaşlar grubu ile tanıştı. Apaşlar daha önceleri batı tarzı müzik yapmaktaydı ancak Karaca ile tanıştıktan sonra müzik daha doğuya döndü. Karaca, grup ile birlikte Altın Mikrofon 1967'ye katıldı. Yarışmaya katıldıkları Emrah şarkısı Erzurumlu Emrah'ın şiirine yapılmış bir Karaca bestesiydi. Yarışmada Karaca'nın grubu ikinci oldu ancak birinci olan gruptan daha çok ilgi gördüler.[2]\n" +
                "\n" +
                "Cem Karaca ve Apaşlar, 1968'de Almanya'ya gidip Ferdy Klein Orkestrası ile 45'likler kaydetti. Bu dönemde Soyarslan şarkısı \"Resimdeki Gözyaşları\", Karaca'nın Emrah'tan sonraki ikinci hit parçası oldu. Bu plak sonrası büyük bir Türkiye turnesi oldu. Ayrıca Almanya'da konserler devam etti. Ayrıca yurtdışına açılmak için İngilizce bir 45'lik kaydedildi. Bunlar Resimdeki Gözyaşları ve Emrah'ın İngilizce versiyonlarıydı. Bu dönemde Cem Karaca, tiyatro sanatçısı Meriç Başaran ile evlendi. Sene sonunda Milliyet'in 1968'in En Sevilen Erkek Şarkıcıları anketinde 4. oldu. Yılın Melodileri anketinde ise \"Resimdeki Gözyaşları\" Türkçe şarkılar arasında 3. oldu. Türkçe ve yabancılar karışık listede ise Resimdeki Gözyaşları 9., Cem Karaca bestesi Ümit Tarlaları ise 24. oldu.\n" +
                "\n" +
                "1969'da grup içinde fikir farklılıkları olmaya başladı. Cem Karaca, daha siyasi müziğe kaymak isterken, Soyarslan bu değişime karşıydı. \"Bu Son Olsun / Felek Beni\" plağından sonra grup dağıldı. Aynı yıl Cem Karaca, Bunalım grubunun prodüktörlüğünü ve menejerliğini yapmaya başladı. İlk 45'likleri \"Taş Var Köpek Yok/Yeter Artık Kadın\" şarkılarının ikisinin de söz ve bestesinde Cem Karaca'nın da adı geçmektedir. Bu 45'likten sonra bu işi bırakan Karaca, grubun bateristi Hüseyin Sultanoğlu'nu kendi grubu Kardaşlar'a almıştır.\n" +
                "\n" +
                "Kardaşlar dönemi\n" +
                "Apaşlar dönemi bittikten sonra grup müziğine devam etmek isteyen Karaca, Apaşlar'ın bas gitaristi Seyhan Karabay ile Kardaşlar grubunu kurdu. 1970'in başında grup üyelerinde birçok değişiklikler oldu. Grup üyeleri sabitlendikten sonra, Almanya'da kayıt yapmaya karar verdiler ancak çıkan bir salgın yüzünden, Karaca ve Kardaşlar birlikte Almanya'ya gidemedi. Bu yüzden Cem Karaca, tek başına Köln'e gitti. Apaşlar sonrası yaşadığı müzikal aradan sonra burada kendi besteleri ve Anadolu türkülerini yine Ferdy Klein orkestrası ile kaydetti. 4 tane 45'lik yayınlandı. Amacı maddi sıkıntı yaşamadan çalışmalar yapmaktı.\n" +
                "\n" +
                "1970 Kasım'ında ise Karaca ve Kardaşlar \"Dadaloğlu/Kalender\" 45'liğini yayınladı. \"Dadaloğlu\", Karaca'nın bir başka hit şarkısı oldu. Bu türkü ayrıca Karaca'nın sola doğru kayışının da bir gösteresi olmuştu. Mart 1971'de Karaca'nın Trabzon'da verdiği bir konserde patlayan 3 bomba ile 30 kişi yaralandı. Aynı yıl Rum piskopos III. Makarios, Kıbrıs Fuarı'nda Türk pavyonunu gezerken, Dadaloğlu şarkısı çalınmıştı. 1971'de Cem Karaca ve Kardaşlar 4 tane 45'lik çıkardı.\n" +
                "\n" +
                "Cem Karaca, aynı yıl tiyatro müziği çalışması da yaptı. Ben Jonson'un yazdığı Ülkü Tamer'in Türkçeleştirdiği Püsküllü Moruk oyununun müziklerini Cem Karaca besteledi ve Kardaşlar ile kaydetti. Grup, şarkıları kaydetti ve tiyatro oyuncularına örnek olsun diye Cem Karaca ve annesi Toto Karaca tarafından şarkıları okundu. Bu tiyatro oyunu çok tutmadı ve kısa süre sonra gösterimden kalktı. Cem Karaca ve Kardaşlar'ın kaydettiği şarkılar ise 2007'de yayınlandı.\n" +
                "\n" +
                "1972'ye Cem Karaca ödülle başladı. Hey Dergisi tarafından \"1971'in en iyi erkek şarkıcısı\" seçildi ve Hey'in turnesine katıldı. Ancak Kardaşlar gitaristi Seyhan Karabay ile anlaşmazlıklar baş gösterdi ve Karaca, Kardaşlar ile yollarını ayırdı. Bu sırada eşi benzeri görülmemiş bir değiş-tokuş meydana geldi. Cem Karaca, Kardaşlar'dan ayrılıp Anadolu Rock'ın güçlü sesi Moğollar'la birleşirken Kardaşlar da Moğollar'la anlaşamayan Ersen Dinleten'i gruplarına dahil etti.\n" +
                "\n" +
                "Moğollar dönemi\n" +
                "Cem Karaca ve Moğollar, birleştikten bir ay sonra Kasım 1972'de Hey dergisi için verdikleri konserde ilk kez sahne aldılar. Yıl sonunda Milliyet'in anketinde Cem Karaca, en iyi erkek şarkıcılar listesinde 2. oldu, Moğollar ise en iyi yerli topluluk seçildi. Hey Dergisi'nde ise ikisi de kendi dallarında 1. seçildiler.\n" +
                "\n" +
                "1973'te \"Obur Dünya / El Çek Tabip\" 45'liği yayınlandı. Ancak grubun asıl başarısı 1974'ün başında kaydedilen \"Namus Belası\" şarkısı ile kazanıldı. Şarkı çok popüler oldu, öyküsü Hey dergisinde çizgi roman olarak yayınlandı. Ancak bu plak sonrası Cahit Berkay çalışmalarını Fransa'da devam ettirmeye karar verince Cem Karaca ve Moğollar yollarını ayırdı.\n" +
                "\n" +
                "Dervişan dönemi\n" +
                "Moğollar'dan ayrılan Cem Karaca, önce Fransa'ya gitmeyen Moğollar elemanları Mithat Danışan ve Turhan Yükseler ile \"Karasaban\" grubunu kurdu ama uzun ömürlü olmadı. Mart 1974'te Dervişan grubunu kurdu. Grup ilk konserlerinden birini Kıbrıs harekatından sonra Hava Kuvvetleri'ne yardım konserinde verdi.\n" +
                "\n" +
                "Şubat 1975'te Cem Karaca'nın en önemli eserlerinden biri olan \"Tamirci Çırağı\" yayınlandı. Bu şarkıdaki \"İşçisin sen, işçi kal\" söylemi Cem Karaca'nın siyasi duruşunu da ilk kez bu kadar açık gösteriyordu. 1975'in sonunda \"Mutlaka Yavrum/Kavga\" 45'liği yayınlandı. 45'liğin ilk şarkısı Mutlaka Yavrum, Filistin Kurtuluş Örgütü için hazırlanmıştı ve 2 farklı Türkçe versiyonunun dışında piyasaya yayınlanmamış İngilizce ve Arapça versiyonları da vardı.[3] 1976'nın başında TRT'de yayınlanacak olan \"Kavga\" şarkısı son anda nedeni açıklanmayan bir sebepten dolayı programdan çıkarıldı. Aynı yıl Cem Karaca, Hey dergisi tarafından bir kez daha en iyi erkek şarkıcı olarak seçildi.\n" +
                "\n" +
                "1977'de Cem Karaca, artan siyasi gerginlikle birlikte, gitgide daha önemli bir figür oluyordu. Aydın'da verdikleri bir konserde CHP İl Başkanı aşırı solcular tarafından dövüldü. Urfa'da verilen bir konserden sonra Dervişan gitaristi Taner Öngür ve bateristi Sefa Ulaştır saldırıya uğradı. Öngür daha sonra bu nedenlerle gruptan ayrıldı. Cem Karaca bu sene tamamı yeni şarkılardan oluşan ilk uzunçaları Yoksulluk Kader Olamaz'ı yayınladı. Bu albümde Karaca besteleri dışında, ünlü şairlerin şiirleri de bulunmaktaydı. Cem Karaca ve Dervişan, 1978'in başında 1 Mayıs plağından sonra yollarını ayırdılar.\n" +
                "\n" +
                "Edirdahan dönemi ve 12 Eylül Darbesi\n" +
                "Cem Karaca, Dervişan sonrası çoğu Kurtalan Ekspres'ten olmak üzere bir müzik grubu kurdu. Adını da Türkiye'nin iki ucu olan Edirne ve Ardahan'dan esinlenerek Edirdahan koydu. Ancak grup 20 gün sonra Kurtalan Ekspres elemanlarının eski gruplarına dönmesiyle eleman değişikliğine uğradı. 1978'de Cem Karaca, Edirdahan ile kaydettiği ilk ve son teklisi Safinaz'ı yayınladı. Bu plak Türkiye'de daha önce hiç görülmemiş olan 18 dakikalık bir rock operaydı. Alt sınıftan Safinaz adlı bir kızın kötü yola düşmesini anlatıyordu. Teklinin diğer şarkıları da Ahmed Arif ve Nazım Hikmet şiirlerinin besteleriydi. Cem Karaca, 1979'da Londra'daki dünyaca ünlü Rainbow Arena'da konser verme başarısı gösterdi.\n" +
                "\n" +
                "1979'da grup dağıldı, Cem Karaca da uzun yıllar sonra ilk kez yanında bir grup olmadan solo olarak çalışmaya başladı. Bu dönemde ayrıca Almanya'ya taşındı. Çoğu Nazım Hikmet şiirlerinin besteleri olan Hasret albümünü yayınladı. Mart 1980'de Sıkıyönetim Mahkemesi'nde Karaca'nın \"1 Mayıs\" plağı \"komünizm progandası\" nedeni ile yargılanmaya başladı. Bu davada şarkıcı Cem Karaca, şarkının bestekarı Sarper Özsan ve plak şirketi sahibi Ali Avaz da suçlanıyordu. Cem Karaca, bu dönemde Avrupa turnesine başlamıştı. Dava başladıktan kısa bir süre sonra da babası Mehmet Karaca'yı kaybetti. Cem Karaca, babasının cenaze törenine katılamadı.\n" +
                "\n" +
                "Almanya yılları\n" +
                "12 Eylül darbesi sonrası Sıkıyönetim Mahkemesi tarafından Melike Demirağ, Selda Bağcan, Şanar Yurdatapan ve Sema Poyraz ile birlikte Cem Karaca da yurda çağrıldı. 13 Mart 1981'e kadar süre tanındı. Bonn'da yaşayan Cem Karaca, yurda dönmek için ek süre istedi. 15 Temmuz 1982'ye kadar Cem Karaca'nın süresi uzatıldı ancak Karaca, Türkiye'ye dönmeyeceğini belirtti ve süresi dolduktan sonra ise 6 Ocak 1983'te Yılmaz Güney ile aynı gün Türk vatandaşlığından çıkarıldı.\n" +
                "\n" +
                "Cem Karaca, bir yandan da müzik hayatına devam etti. Almanya'daki müzisyen arkadaşı Fehiman Uğurdemir ile birlikte 1982'de Bekle Beni albümünü yayınladı. Bu albümdeki \"Oğluma\", \"Alamanya Berbadı\" ve \"Bekle Beni\" gibi şarkılar Karaca'nın ülkesine duyduğu özlemi göstermekteydi. Bu albüm Karaca'nın vatandaşlıktan çıkarıldığı için medyada yer alamamasından dolayı çok fazla bilinmedi. 1984'te ise bir şarkısı dışında tüm şarkıları Almanca olan Die Kanaken albümünü yayınladı. Bu albüm Alman oyun yazarları Henry Böseke ve Martin Burkert tarafından göçmen Türkler'in Almanya'da yaşadıkları zorlukları anlatmaktaydı. Ayrıca albüm bir tiyatro oyununa da çevrildi. Karaca, albüm yayınlandıktan sonra Alman televizyonlarında albümün adı olan Die Kanaken olarak sahne aldı ve albümü tanıttı.\n" +
                "\n" +
                "Türkiye'ye dönüş\n" +
                "1985'te Karaca, arkadaşı Mehmet Barı aracılığıyla Başbakan Turgut Özal ile görüşerek, ülkeye geri dönme isteğini bildirdi ve Münih'e gelen Özal ile konuştu. Özal'ın olumlu yanıt vermesi ile hukuki işlemler başlatıldı. Yıl sonunda vatandaşlıktan çıkarılmasına sebep olan davadan beraat etti. 1987'de de hakkında verilen gıyabi tutuklama kararı kaldırıldı. 29 Haziran 1987'de Cem Karaca, Türkiye'ye döndü. Aynı yıl Merhaba Gençler ve Her Zaman Genç Kalanlar albümünü çıkardı. Bu albüm o senenin en çok satan albümlerinden biri oldu. 1988'de bu albümü Töre takip etti. Bu albüm sonrası Cem Karaca, yasaklı olduğu TRT ekranlarına da çıkmaya başladı.\n" +
                "\n" +
                "1990'lar\n" +
                "Cem Karaca, arkadaşı Uğur Dikmen ve Cahit Berkay ile müzikal ortaklık kurarak Yiyin Efendiler albümünü yayınladı. Bu albümdeki \"Oh be\" şarkısında, kendisini \"dönek\" diye adlandıranlara cevap olarak \"Ben döneksem döndüm diye memleketime / Döndüm baba döndüm işte oh be\" diyerek cevap verdi. 21 Temmuz 1990'da sözlerini kendi yazıp, bestesini Cahit Berkay'ın yaptığı Kahya Yahya şarkısı ile Altın Güvercin en iyi şarkı ödülünü kazandı. Bu dönemde Sosyaldemokrat Halkçı Parti için konserlere çıktı.\n" +
                "\n" +
                "Karaca, 1992'de UNICEF için hazırlanan ve İbrahim Tatlıses, Ajda Pekkan, Muazzez Abacı, Leman Sam, Fatih Erkoç gibi ünlü isimler korosunun seslendirdiği \"Sev Dünyayı\" şarkısının sözlerini yazdı ve koroda da yer aldı. 22 Temmuz 1992'de annesi Toto Karaca hayatını kaybetti. Yılın sonlarına doğru Dikmen ve Berkay ile ikinci çalışması olan Nerde Kalmıştık? albümünü yayınladı. \"Raptiye Rap Rap\" ve \"Islak Islak\" besteleri ile büyük başarı yakaladı.\n" +
                "\n" +
                "Bu albümden sonra Cem Karaca, bir süre müzikle aktif olarak ilgilenmedi. 1994'te TRT'de Raptiye adlı programı sundu. 1995'te ise Flash TV'de Cem Karaca Show'u, 1996'da aynı kanalda \"Efendime Söyleyeyim\" programını yaptı. 95'te bir sanatçı grubu ile Bosna-Hersek'e gidip, savaş sonrası zor durumda olan Bosnalılara destek verdi.\n" +
                "\n" +
                "Sanatçının müziğe geri dönüşü 1997'nin sonunda vizyona giren Ağır Roman ile oldu. Filmin yapımcısı, eski Apaşlar gitaristi ve Karaca'nın dostu Mehmet Soyarslan'nın yazdığı, 1968'de Cem Karaca'ya ün getiren \"Resimdeki Gözyaşları\"nı, Karaca film için yeniden kaydetti. Filmin ana müziği olan parça, Karaca'yı tekrardan müzik piyasasına soktu. Eski plak şirketi, izinsiz olarak \"The Best of Cem Karaca\" serisini piyasaya sürdü.\n" +
                "\n" +
                "1999'da Türk rock müziğinin duayenleri olan Cahit Berkay, Engin Yörükoğlu, Ahmet Güvenç ve Uğur Dikmen'in desteğiyle 'Bindik Bir Alamete...' isimli albümünü çıkardı. 2000'de Cem Karaca'nın da rol aldığı Kahpe Bizans'ın müziklerinin bazılarını seslendirdi. Bu filmin de yapımcısı olan Soyarslan'ın yazıp Apaşlar zamanında Dede Korkut'tan esinlenip Sadık Bütünay ile kaydettiği ama yayınlamadığı şarkıları Cem Karaca seslendirdi. Bu eserlerden sonra ölümüne dek birkaç şiir albümünde konuk sanatçı oldu.\n" +
                "\n" +
                "Son Çalışmaları ve Vefatı\n" +
                "Cem Karaca, Şubat 2001'de Murat Töz, Barış Goker ve Cengiz Tuncer ile Cem Karaca Trio olarak sahne almaya başladı. Mayıs 2001'de ise Barış Manço'nun ölümü ile vokalistsiz kalan Kurtalan Ekspres ile beraber çalmaya başladı. Harbiye Açık Hava Konserleri'nde sahne aldılar. 2002'de Yol Arkadaşları adlı grubu kurup, onlarla sahne aldı. 8 Şubat 2004 sabahı, solunum ve kalp yetmezliği sebebiyle geçirilen kalp krizi nedeniyle Bakırköy Acıbadem Hastanesi'ne kaldırılan Cem Karaca kurtarılamadı. Karacaahmet Mezarlığı'nda babası ile aynı mezara defnedildi.\n" +
                "\n" +
                "Ölümünden önce kaydettiği son şarkılar, ölümünden kısa süre sonra yayınlandı. İlk önce \"Hayvan Terli\" teklisi yayınlandı. Mehmet Eryılmaz'ın bu şarkısına Karaca'nın bir bar programında bu şarkıyı söylerkenki görüntüleri ile klip çekildi. Mayıs 2005'te, ölümünden 10 gün önce (2004) Mahsun Kırmızıgül ile kaydettiği \"Hayat Ne Garip?\", Kırmızıgül'ün Sarı Sarı albümünde yayınlandı. Karaca ve Kırmızıgül'ün stüdyodaki görüntülerinden oluşan bir klip yayınlandı. Haziran 2005'te ise Murathan Mungan'ın sözlerini yazdığı şarkıların yeni yorumlarından oluşan \"Söz Vermiş Şarkılar\" albümünde Yeni Türkü'nün \"Göç Yolları\" eserini yorumladı.\n" +
                "\n" +
                "2005 yılında Yavuz Bingöl, Edip Akbayram, Manga, Teoman, Deniz Seki, Volkan Konak, Haluk Levent, Suavi, Ayhan Yener, Tuğrul Arseven tarafından yorumlanan Cem Karaca şarkılarından oluşan Mutlaka Yavrum albümü yayınlandı. Bu albüm daha önce yayınlanmamış İngilizce bir Cem Karaca şarkısı da içeriyordu.\n" +
                "\n" +
                "Ölümünün 6. yılında Beyaz Show'da daha önce kaydedip yayınlamadığı \"Karagözlüm\" adlı şarkı ilk kez gün yüzüne çıkmıştır.", "Kurtalan Ekspres 35 yıllık marka hüviyetine sahip Türkiye’nin ilk rock gruplarından birisidir. Başlangıçta 1972 yıllarının sonuna doğru Murat Ses, Ahmet Güvenç, Ömür Gidel ile başlayan grup 1978’den itibaren Bahadır Akkuzu’nun katılımıyla devam etti. Yıllar içerisinde;\n" +
                "\n" +
                "Davul: Ali Serdar (1971), Nur Moray (1971-1976), Hüdai Özgüder (1971-1972), Engin Yörükoğlu (1972-1974), Caner Bora (1974-1988) Hüseyin Cebeci (1988-1995),Cihangir Akkuzu (1985- 2012), Sefa Ulaştır (2013-)\n" +
                "\n" +
                "Bas gitar: Özkan Uğur (1971)(1972-1974)(1976), Mithat Danışan (1971-1972)(1974-1976), Ahmet Güvenç (1976-1988)(1991- )\n" +
                "\n" +
                "Gitar: Fuat Güner (1971-1972)(1978), Ohannes Kemer (1971-1974)(1975)(1976-1977), Nezih Cihanoğlu (1972), Kirkor Kalender (1972), Mustafa Sarışın (1974), Nurhan Özcan (1974), Samim Boztaş (1975), Fehimen Uğurdemir (1976)(1980), Özkan Uğur (1978), Bahadır Akkuzu (1978-1985)(1986-2009), Gür Akad (2009- 2012), Serdar Öztop (2012-2014), Cem Yalçınkaya (2014-)\n" +
                "\n" +
                "Flüt: Erdinç Avcı (1971-1972), Oktay Aldoğan (1974-1980), Serdar Ertürk (1980-1988)\n" +
                "\n" +
                "Klavye: Murat Ses (1972-1974), Yalçın Gürbüz (1975), Kılıç Danışman (1976-1977)(1978-1980), Ömür Gidel (1978-1985), Nejat Tekdal (1980-1982), Jean Jacques Falaise (1985-1986), Ufuk Yıldırım (1988-1996), Garo Mafyan (1988-1992), Elif Turhan (1991), Bülent Güven (2009- )\n" +
                "\n" +
                "gibi çok çeşitli sanatçılarla beslendi. Birçok beste ve düzenlemelere de imza atmış olan grup “Etnik Rock” akımının da yurtdışı temsilcilerinden sayılmaktadır…\n" +
                "\n" +
                "Kurtalan Ekspres Türkiye’de bugüne kadar kurulmuş en sağlam gruplardan birisi… Yıllarca Barış Manço’nun orkestralığını yürütmüş olan bu grup Barış Manço’nun vefat etmesi üzerine Cem Karaca’yla çalışmaya başlamıştır…\n" +
                "\n" +
                "Barış Manço vefat etmeden önceki dönemde çıkan kaset yapma fikri Barış Manço’nun vefatı nedeniyle ertelendi… Kurtalan Ekspres Müzikal Yolculuğunda 2003 Yılında 3552 yayınlandı, Sonra günün birinde, onlar gibi asi ve onlar gibi güzel olan Teoman, Feridun Düzağaç, Gür Akad, Özlem Tekin, Ogün Sanlısoy, Fuat Güner, Özkan Uğur, Bülent Ortaçgil, Kıraç ve Kurtalan Ekspres’ten Ahmet Güvenç, Bülent Güven, Cem Yalçınkaya, Tolga Akyurt, Sefa Ulaştır da bir araya geldiler ve hep özledikleri gökyüzündeki arkadaşlarına birer selam gönderdiler,son yıllarda en çok satan rock albümü olan Kurtalan Ekspres GÖĞE SELAM sizlerle buluşmaya devam ediyor.\n" +
                "\n" +
                "Sizde Kurtalan Ekspres’in bir yolcusu olmak istiyorsanız .\n" +
                "Kurtalan Ekspres’de bilet geçmez.Kurtalan Ekspres’in görevlileri size gelirler ve “yüreğiniz var mı ve o yürekte katıksız, karşılıksız bir sevgi bulunuyor mu“ diye sorarlar.\n" +
                "\n" +
                "Varsa çıkartır gösterirsiniz. İşte o zaman Kurtalan Ekspres’in bir yolcusu olabilirsiniz. Kurtalan Ekspres sadece sevgi taşır çünkü.", "26 Kasım 1968 tarihinde Adana'nın Yüreğir ilçesindeki Yamaçlı mahallesinde doğmuştur. Dokuz kardeşin sekizincisi olan Haluk Levent, ailesinin Nusayri olduğunu fakat Arap olmadıklarını ifade etmektedir. İlkokulu Sabancı İlköğretim Okulu'nda okudu. Adana Atatürk Lisesi'nden mezun oldu. Sonra sırasıyla Karadeniz Teknik Üniversitesi Orman Mühendisliği, Ankara Üniversitesi Kastamonu Meslek Yüksek Okulu Bilgisayar Programcılığı, Orta Doğu Teknik Üniversitesi Fizik Bölümü ve Ankara Üniversitesi Muhasebe bölümünde kısa zamanlar öğrencilik yaptı. Üniversite giriş sınavlarını kazanıyordu ama eğitimini istikrarlı bir şekilde ilerletemiyordu. Bu durumda ailesinin maddi sıkıntıları da önemli bir rol oynuyordu.\n" +
                "\n" +
                "Sınavlarla geçen bu yıllar içinde ticaretle uğraşan Haluk Levent, başarısız bir ticaret adamı olarak Adana'dan ayrıldı ve kendini yollara verdi. İlk albümünün “Yollarda\" adını alması da bu günlerdeki deneyimlerin sebebidir. Birçok şehirde dolaşıp şarkı söyledi. Kimi zaman hasta bir kız çocuğu için sokak sokak dolaşıp şarkı söyleyerek para toplamaya çalıştı. Bu çabaların bazılarında başarılı oldu.\n" +
                "\n" +
                "1992 yılında İstanbul'a geldi. Ortaköy'de çeşitli barlarda çalıştı. Yıldıray Gürgen ile tanıştı.Bununla beraber Serdar Öztop ve Akın Eldes gibi kaliteli müzisyenlerle çalışıp albümlerinin kalitesinin artmasını sağladı 1990’da başladığı albüm çalışmaları zahmetli ve yıldırıcı üç yılın ardından meyvesini verdi. 1993 temmuzunda Yollarda albümünü çıkarttı. Bu albüm aynı zamanda Anadolu rock müziğinin ortaya çıktığı 70’lerden sonra ikinci yükseliş döneminin ilk eserlerindendir. Aynı yıl Moğollar da 20 yıl aradan sonraki ilk albümünü çıkartmıştır. Yollarda hiç beklenmedik bir şekilde yaklaşık ikiyüzbinlik satış rakamına ulaştı. Bu, Türkiye Müzik piyasasında açılan yeni bir kulvarın ardından milyonları sürükleyeceğine dair ilk işaret gibiydi.\n" +
                "\n" +
                "İlk albümün ardından 1995 ekiminde Bir Gece Vakti bir milyona yaklaşan satış rakamı yakaladı. Yine 1996'nın hemen sonunda Arkadaş albümü piyasaya çıktı. Bu albümle sanatçı, Anadolu rock müziğin müzikal anlamda en başarılı örneklerinden birine imza atmıştır. Sanatçı Arkadaş albümü için \"Bu albümle dünya standartlarını yakaladım\" demektedir.\n" +
                "\n" +
                "1997'nin Ağustos ayında cezaevine girdi. Yaklaşık on yıldır kurtulamadığı ticari bir dava yüzünden 9 ay cezaevinde kaldı. Cezaevindeyken uzun saçlarını kesip Akkuyu’ya, yapılması düşünülen Nükleer santral projesinin protesto gösterilerine yolladı. Cezaevine girmeden önce oluşturmuş olduğu kayıtlarla Mektup albümünü çıkarttı. Mektup içeriden dışarıya yazılmıştı ve dışarıda bu “Mektup”u yüz binlerce kişi okudu. İçerde boş durmadı Kedi Köprüsü adlı ilk kitabını yazdı. Gözleri kör eden ışıklardan kurtulmuş ve her ne kadar yüz bin mektup almış olsa da sonunda kendisine kalmıştı. Bu “kendinelik” bir kitapla somutlaştı.\n" +
                "\n" +
                "Cezaevinden çıktıktan sonra yeni albümünü hazırlamak için çok az bir vakti vardı. Çünkü 18 aylık askerlik görevi bekliyordu. Bu koşullar altında 1998 eylülünde Yine Ayrılık albümünü çıkarttı ve askere gitti. O askerdeyken bedelli askerlik çıktı. Anlamlı bir talihsizlik oldu. Askerdeyken Türkiye'nin daha önce hiç gitmemiş olduğu yerlerinde konserler verdi. Bütün Doğu ve Güneydoğu Anadolu’da konserler verdi. 1999 depreminin ardından İzmit'te kurulan Çadır kentlerde bizzat çalışıp çadırlar kurdu. Depremzedeler yararına konserler verdi. Askerdeyken izin günlerinin hepsini stüdyoda geçirdi. 2000'in hemen başında www.leyla.com'u çıkarttı. Gittikçe dijitalleşen bir dünyada duyguların da dijitalleştiğinden dem vuruyor, \"Kamyoncunun Türküsü\" şarkısıyla Susurluk’a gönderme yapıyordu.\n" +
                "\n" +
                "Askerlik görevinin ardından sırasıyla 2001 şubatında Kral Çıplak, 2002 ekiminde Bir Erkeğin Günlüğü, 2004 eylülünde Aç Pencereni, 2005 nisanında Annemin Türküleri adlı albümlerini piyasaya sürdü. Ayrıca ikinci deneme kitabı olan Moritos'un Düşleri'ni yayımladı. Sanat yaşamının on beşinci yılına (2005) adım atan sanatçı, bu geçen on beş yıl boyunca yurtiçinde ve yurtdışında yaklaşık on bin konsere çıktı. 15 yılda yaklaşık olarak beş bin gün olduğunu varsayarsak, buradan Haluk Levent'in bu 15 yıl içinde her gün yaklaşık iki konser verdiği sonucunu çıkarabiliriz ve bir günde 11 saat konser verdi ismini altın harflerle tarihe yazdı Türkiye’de en çok konser veren sanatçıların başında gelen Haluk Levent, bu konserlerin çok önemli bir kısmından para almamış, konserin gelirini ihtiyacı olan hastalara vakfetmiştir. Yardımsever Rock’çı tanımının yakıştırılması bu sebeptendir.\n" +
                "\n" +
                "Aynı zamanda Çevre Sorunlarına karşı duyarlılığıyla ön plana çıkan sanatçı, hemen hemen her albümünde çevre bilincini aşılama yolunda şarkılara yer verdi. Türkiye’nin değişik bölgelerinde çevreye zarar verdiği söylenen projeler aleyhine davalar açtı ve açılan davalara müdahil oldu. Mersin’in Kazanlı ilçesindeki Caretta Caretta Kaplumbağalarının soyunun tükenmemesi için protesto gösterilerinde bulundu. Haluk Levent Ela adında bir kız çocuğuna sahiptir.\n" +
                "\n" +
                "Kısa sanat yaşamına on iki albüm, bin konser, iki kitap yüzlerce ödül, yardım konserleri, iki tane rekor konser (on iki saatlik), onlarca çevre davası sığdırdı.\n" +
                "\n" +
                "2010\u00AD'un son aylarında Hacivat Karagöz adlı albümünü çıkardı. Sanal alemde izlenme rekorları kırdı ama kaset-cd satışlarında bu oran görülmedi.\n" +
                "\n" +
                "2014 yılının Şubat ayında Dostane isimli albümünü çıkardı.", "Kuruluş\n" +
                "\n" +
                "1965 yılında Fuat Güner'in elindeki The Beatles plağını gören Mazhar Alanson plağı beraber dinleme teklifi eder ve Mazhar ve Fuat'ın tanışması böyle gerçekleşir. İkili, öncelikle Kaygısızlar grubunda çalışırlar. Kadrosunda Ali Serdar, Semih Oksay ve Fikret Kızılok gibi isimleri barındırırlar. Daha sonra, Barış Manço ile çalışmaya başlarlar. Bu arada da üçüncü isim Özkan Uğur, Kurtalan Ekspres, Erkin Koray, Ersen ve Dadaşlar gibi isimlerle çalışmaktadır.\n" +
                "\n" +
                "MFÖ Öncesi\n" +
                "\n" +
                "Kaygısızlar'dan sonra Mazhar ve Fuat beraber müzik yapmaya başladı. Mazhar - Fuat'ın tek albümü Türküz Türkü Çağırırız 1973'te çıktı. Ancak, Güllerin İçinden'in ilk halinin de bulunduğu bu albüm çok fazla ilgi görmedi. Albümden birkaç 45'lik çıktı. Mazhar ve Fuat, yanlarına Özkan Uğur, Ayhan Sicimoğlu ve Galip Boransu'yu alarak 1976'da İpucu Beşlisi'ni kurdu. Grup bir 45'lik çıkardı. \"Heyecanlı\" şarkılarına İzzet Öz tarafından da bir klip çekildi. Bu klip Türkiye'nin ilk klibi sayılmaktadır.\n" +
                "\n" +
                "Grubun ayrılmasından sonra grup üyeleri ayrı ayrı müzikal çalışmalara başladılar. Fuat Güner ve Özkan Uğur, Ferhan Şensoy'un Şahları Da Vururlar oyunu için beste yaptılar ve bu müzikal oyunda sahneye çıkıp söylediler. Ferhan Şensoy'la ortaklıkları \"Kahraman Bakkal Süpermarkete Karşı\" oyunuyla devam etti. Mazhar ve Fuat, \"Merhaba Müzik\" müzikalinde yer aldılar. Özkan Uğur 1978-79 arasında Galip Boransu ve Cengiz Teoman ile Grup Karma'yı kurdu. 1978 Eurovision Şarkı Yarışması Türkiye Finali'ne İmkansız şarkılarıyla katılıp 4. oldular.\n" +
                "\n" +
                "Ayrı geçen bir süreden sonra üçlü Sezen Aksu, Ajda Pekkan ve Seyyal Taner gibi isimlerin arkasında çaldı. Bu dönemle ilgili bir Mazhar Alanson anısı şöyledir:\n" +
                "\n" +
                "“\tAjda Pekkan ile bir gün Bebek Belediye Gazinosu'nda sahneye çıktık, çalıyoruz. Bir şarkının başında Ajda şarkının sözlerini unutmaz mı? Herkesin eli ayağı birbirine dolaştı. Ajda büyük bir ustalık göstererek bize döndü \"Gördünüz mü, bensiz olmuyor\" dedi. Sahnede öyle kalakaldık. Seyircilere döndü, o malum girizgâh \"bir iki üç\" dedi ve parçaya girdi. Ama bu sefer de biz çalmıyoruz. O anda verilen spontane bir karar. Ajda şaşkına döndü. Arkasında müzik yok. Biz de dedik ki \"Demek bizsiz de olmuyormuş.\" Tabii bu ilişki hemen sona erdi. Çünkü o bir stardı. [1]\t”\n" +
                "Ajda Pekkan ile çalışmalarından kazandıkları parayı Fuat Güner stüdyoya yatırdı ve müzik çalışmalarına hız verdiler. 1981'de besteleri \"Ele Güne Karşı\" şarkısını Seyyal Taner'e verirler ancak sanatçı TRT'den boykot yediği için albümü çıkaramadılar. Böylece şarkı MFÖ'ye kalır ve 3 sene sonra bu şarkı ile grup patlama yapar.\n" +
                "\n" +
                "1980'ler\n" +
                "En sonunda 1984'te grup ilk albümleri Ele Güne Karşı'yı çıkardılar. Buradaki birçok beste Şahları da Vururlar oyunu için bestelenmiş, daha sonra sözleri değiştirilerek Alanson tarafından yeni sözler yazılmıştı. Bu albümle Mazhar Alanson söz yazarlığındaki başarısı ile dikkat çekmişti. Albüme Erkan Oğur, Garo Mafyan, Onno Tunç, Taner Öngün, Asım Ekren gibi ünlü müzisyenler eşlik etmişti.\n" +
                "\n" +
                "Grup 1985 Eurovision Şarkı Yarışması'na katıldı. Diday Diday Day ile katıldıkları yarışmada 14. oldular. Bu yarışmada sunucunun Mazhar–Fuat–Özkan'ı kısaltıp MFÖ demesi grubun bu kısaltmayı kullanmasına neden oldu. Yarışma sonrası çıkan Peki Peki Anladık'ın düzenlemelerini Peter Schön yapmıştı ve grup 80'li yıllarda popüler olan new wave tarzına yönelmişti. Bu albümdeki \"Buselik Makamına\", Mazhar Alanson'un daha sonra daha sıkça eğileceği tasavvuf konulu ilk bestesiydi. Albümün ikinci yüzü tamamen İngilizce şarkılardan oluşmaktaydı. Ancak MFÖ'nün yurtdışına açılma hayalleri gerçekleşemedi.\n" +
                "\n" +
                "1986'da Vak The Rock çıktı. Hollanda'da kaydedilen albümün bir de animasyon klibi vardı. Bu da Türk müzik tarihinde bir ilkti. 1987 Eurovision Şarkı Yarışması Türkiye Finali'ne bu sefer No Problem şarkısıyla katıldılar ancak yarışmaya katılım şansını kazanamadılar. 1987'de yine önceki albümlerinin tarzında No Problem çıktı. 1988'de Mazhar Alanson Arkadaşım Şeytan filminde oynadı. Özkan Uğur ve İpucu Beşlisi'nden Ayhan Sicimoğlu'un da rol aldığı filmin müziklerini MFÖ yaptı. No Problem albümünden \"Tam Ortasındayım\", albümdekinden farklı olarak Yaprak Özdemiroğlu ile düet olan \"Muhabbetler Sana Doğru\", daha önce hiçbir albümde yer almamış \"Doldum Doldum\" ve daha sonraki albümlerinden Dönmem Yolumdan'da yer alacak \"Hep Böyle Sev\" bu filmde kullanıldı. Aynı yıl MFÖ, 1988 Eurovision Şarkı Yarışması'na Sufi ile katıldı. Ancak, bu sefer de 15. oldular.\n" +
                "\n" +
                "1989'da grubun ilk toplaması The Best of MFÖ çıktı. Aynı yıl 3. kez Eurovision'a katılmak isteyen grup Naim Süleymanoğlu hakkındaki \"Adı Naim\" adlı şarkılarıyla Türkiye elemelerini geçemediler. Şarkıyı ise hiçbir albümlerine koymadılar.\n" +
                "\n" +
                "1990'lar\n" +
                "1990'da Geldiler albümü çıktı. Albüm diğer MFÖ şarkılarına göre farklılıklar içeriyordu. Dünyada rap'in popüler hale gelmesiyle MFÖ, bunun Türkiye'de ilk örneklerini Ali Desidero ve Anında Görüntü şarkılarıyla yaptı. Albümde Fahir Atakoğlu'yla çalışan grup daha sonra Özkan Uğur ile özdeşleşecek anlamsız sözlerden oluşan iki şarkı, Sude ve İk Ben, bir ilahi olan Ateş-i Aşka şarkılarıyla dikkat çekti. Ayrıca ilk kez bir şairin şiirini yorumladılar. (Geçiniz - Edip Cansever)\n" +
                "\n" +
                "1992'de iki albümü birden farklı firmalarla çıkardılar. Agannaga Rüşvet eleştirel şarkılarıyla dikkat çekti. Gazelhan Sami Özer'in de iki şarkıda vokal yaptığı albümde, Belediye Nerede, Rüşvet, Patlamalar gibi mizahi eleştirilerin yanında Fuat ve Özkan'ın başlarına iç açmasından korktukları Deneylere Doğru şarkıları yer almaktaydı.[2] Aynı yıl çıkan diğer albüm Fahir Atakoğlu ile çalışılan Dönmem Yolumdan, ünlü goth rock grubu Bauhaus vokalisti Peter Murphy ile Don't Wanna See It cover'ını bulunduruyordu. Ancak bu iki albüm de önceki albümlerin başarısına ulaşamadı.\n" +
                "\n" +
                "1995 tarihli Mazeretim Var Asabiyim Ben rock tarzının kullanıldığı, Erdal Kızılçay ile çalışılmış bir albümdü. Özellikle klip şarkıları Mazeretim Var Asabiyim Ben ve eski dostları Fikret Kızılok'un sözlerini yazdığı Sakın Gelme şarkılarıyla yeni bir jenerasyon da MFÖ ile tanışmıştı. Gruba konserlerde ünlü gitarist Yavuz Çetin eşlik etti.\n" +
                "\n" +
                "Bu albümden sonra Mazhar Alanson sinemaya ağırlık vermiş ve solo bir albüm yapmış, Özkan Uğur da sinema ve televizyona ağırlık vermiş, Fuat Güner ise, bir solo albümle beraber birçok sanatçıya destek olmuştur. Üçlünün solo işleriyle uğraşmaları nedeniyle grup müziğe bir süre ara vermiştir.\n" +
                "\n" +
                "2000'ler\n" +
                "Grup uzun bir aradan sonra Haziran 2003'te MFÖ single'ını çıkarırlar. Ele Güne Karşı ve Yalnızlar Garı şarkılarının yeni düzenlemelerinin bulunduğu bu single'dan sonra Collection best of'u çıktı. Yeni şarkı olan Enayi Miyim Ben'in bulunduğu bu albüm de Ele Güne Karşı dışında ilk toplama albümlerinde bulunmayan ve daha az bilinen şarkılarının yeni düzenlemelerinden oluşmuştu.\n" +
                "\n" +
                "11 Nisan 2006'da ise, 11 yıllık aradan sonra yeni şarkıların bulunduğu isim babasının Cem Yılmaz olduğu AGU piyasaya sürüldü. Daha önce solo şarkılar olarak çıkmış Ne Bileyim Ben, Olduramadım şarkılarının yanında klip şarkıları Sarı Laleler ve Vurgun Yedim ile listelere girdiler.\n" +
                "\n" +
                "Yine 5 yıl sonra 2011 yılında \"Ve MFÖ\" albümü yayınlanılır. ve Hep yaşın 19 ve Masal adlı şarkılara klip çekilir.", "3 Hürel veya 3 Hür-El, Onur (1948), Haldun (1949) ve Feridun Hürel (1951) kardeşler tarafından 1970 yılında Trabzon'da kurulan Anadolu rock grubu.\n" +
                "\n" +
                "İlk isimleri Yankılar'dır. Ancak Yankılar isminin daha önce başka bir grup tarafından kullanıldığını öğrenince isimlerini İstanbul Dörtlüsü olarak değiştirirler. Daha sonra sırayla Trio İstanbul, Oğuzlar, Alizeler ve Biraderler isimlerini kullanırlar.\n" +
                "\n" +
                "Müzikle tanışmaları babalarının sınıf geçme hediyesi olarak eve getirdiği akordiyon sayesinde olur.\n" +
                "\n" +
                "İlk kez 27 Kasım 1965'te Fatih’de Kamer Düğün Salonu’nda sahne alırlar. Çaldıkları ilk şarkı The Young Ones’dır. 1966 yılında bir arkadaşları ile birlikte İstanbul Dörtlüsü’nü kurarlar.\n" +
                "\n" +
                "1967 yılında Oğuzlar isimli gruplarını kurar ve Zeki Müren’in Benim olsan sana verirdim ben canımı parçasını twist formda yorumlayarak Hürriyet Gazetesi'nin düzenlediği Altın Mikrofon Yarışması'na katılırlar.\n" +
                "\n" +
                "1967 yılı sonlarında uzun sure kullanacakları Biraderler isimini alırlar. Bu isimle daha ciddi mekanlarda konserler vermeye başlarlar. Ancak isimlerinin duyulmasını sağlayan asıl önemli şey zamanın popüler müzik dergisi olan Diskotek’e verdikleri röportajdır. Bu röportaj konserlerinde sadece kendi bestelerini çalan, sahneye hippi kostümleri çıkan grubun tanınmasında önemli bir rol oynar. Saçları da okulda kendilerine sorun çıkaracak kadar uzundur artık. Feridun kardeş Vefa Lisesi'nden okulu bitirmesine birkaç ay kalmışken atılır. Lise tahsilini Pertevniyal Lisesi’nde tamamlar. Diskotek dergisinin düzenlediği yarışmada ikinci olurlar. 1968’de artık tüm kardeşler lise tahsillerini tamamlamıştır.\n" +
                "\n" +
                "70’li yılların başında Feridun Hürel Selçuk Alagöz Orkestrası’nda çalmaya başlar. Selçuk Alagöz’le Türkiye’nin birçok yerinde konserlere katılma fırsatı bulur. Diğer kardeşler Biraderler’le bir Anadolu turnesine katılır ve bu çalışmalarla kazandıkları paralarla yeni enstürümanlar alma fırsatı bulurlar. Daha sonra Onur ve Haldun kardeşler de Selçuk Alagöz Orkestrasına katılacak ve bir 6 ay da beraber çalışacaklardır. Kendi ayakları üzerinde durmak ve kendi özgün müziklerini yaratmak için 20 Temmuz 1970’de kendi tabirleri ile Kabataş Vapur İskelesi’nde enstrümanlarla dolu bir minibüste 3 Hürel grubunu kurarlar. Fakir bir ailenin mensubu olan Hürel kardeşler için en büyük engel yeni enstrümanlara sahip olamamaktır. Bu yıllarda daha sonra grubun sembollerinden biri olacak olan babası ile beraber yaptıkları çift saplı saz-gitar diye adlandırdıkları ve günümüze kadar taşıdıkları enstrümanları sahneye çıkar.\n" +
                "\n" +
                "İlk 45’likleri Ve Ölüm/Şeytan Bunun Neresinde olur. Yeni plaklarla birlikte ünleri hızla yayılır. Dergi listelerinin üst sıralarında dolaşmaya başlarlar.\n" +
                "\n" +
                "Daha sonraki yıllarda Diskotür etiketi taşıyan birçok 45’lik yaparlar. 1973 yılında yaptıkları ilk uzunçalarları ile Türk Popu dergisinin verdiği Altın Plak ödülünü alırlar.\n" +
                "\n" +
                "1975’te Onur’un askerliği nedeni ile grup çalışmalarına 6 ay kadar ara verir. Aynı durum 1977 yılında Feridun ve Haldun’un askerliği nedeni ile tekrarlanır ve bu, grubun iki sene müziğe ara vermesine neden olur. Feridun ve Haldun kardeşlerin askerlikleri sırasında annelerini kaybederler. Onur ve Haldun bu dönemden sonra evlenip müziği bırakırken Feridun şansını İngiltere’de denemek ister. Ancak orada aradığını bulamaz. 1981 yılında yurda döner ancak müziği bırakır ve reklamcılık sektöründe çalışmaya başlar. Aynı zamanda İstanbul Ticaret Üniversitesi ve Yeditepe Üniversitesi’nde öğretim görevlisi olarak görev yapar. Diğer kardeşlerden Haldun Marmara Üniversitesi, İstanbul Ticaret Üniversitesi, Bahçeşehir Üniversitesi ve Acıbadem Üniversitesi[1]'nde öğretim görevlisidir. Onur ise eğitimci olur ve İsmet İnönü İlköğretim Okulunda öğretmenliğe devam eder. Kendisi koyu bir Trabzonsporludur.\n" +
                "\n" +
                "Kardeşler 1996’da müzik için tekrar bir araya gelir ve 1996'da Efsane…Yeniden, 1999'da 1953 Hürel adlı iki albüm daha yayınlarlar.", "Hayko Cepkin, Kurban, Öztürk, Birol Namoğlu, Ogün Sanlısoy, Aylin Aslım, Koray Candemir ve Demir Demirkan gibi isimlerle sahneyi paylaşmıştır. Çalıştığı isimlerin bazılarının albümlerine düzenleyici olarak katkıda bulundu. Son olarak da Murathan Mungan'ın Söz Vermiş Şarkılar adlı albümünde Aylin Aslım'ın seslendirdiği \"Kimdi Giden\" (Yeni Türkü'nün Dünyanın Kapıları albümünde \"Terkeden\" adıyla yer almıştı) adlı bir Yeni Türkü bestesini düzenledi ve Ogün Sanlısoy ile \"Korkma\" adlı şarkıyı seslendirdi. Ayrıca Sanlısoy'un albümünde yer alan Kaybettik Severken parçasında klavye performansı yer aldı.\n" +
                "\n" +
                "Bu sırada evinin odasında kaydettiği bestelerini hayata geçirme kararı aldı ve 29 Haziran 2005'te Sakin Olmam Lazım adlı albümü piyasaya sürüldü.2007 yılında da projelerini devam ettirdi ve Tanışma Bitti adındaki ikinci çalışmasını oluşturdu. Teoman'ın \"Gökdelenler\" şarkısını, 3 Hürel grubunun Saygı albümünde \"Ağlarsa Anam Ağlar\" adı parçayı ve son olarak Cem Adrian'nın Emir adlı albümündeki \"Kelebek\" parçasını kendi tarzında yorumlamıştır. Gökçe Dinçer ile \"Aklım Giderken\", Serap Yağız ile \"Hoşgeldin Güneş\" adlı parçalarda düet yapmıştır. Nilüfer'in 3 Şubat 2011 tarihinde çıkardığı 12 Düet adlı albümünde Hayko ile Nilüfer \"Aşk Kitabı\" adlı parçayı beraber söylemişlerdir. Kurtalan Ekspres'in Göğe Selam albümünde Barış Manço, Cem Karaca, Bahadır Akkuzu'ya ithafen okunan şarkılar içinde Barış Manço'nun \"Yeni Bir Gün\" şarkısını seslendirdi. Kurtalan Ekspres'in Göğe Selam II adlı albümünde Cem Karaca'nın \"Maden Ocağı\" adındaki parçasını seslendirdi. Son olarak Ahmet Kaya anısına 2014 yılında piyasaya sunulan ...Bir Eksiğiz isimli albümde Memleket Hasreti isimli parçayı kendi yorumunu katarak seslendirmiştir.\n" +
                "\n" +
                "Grubu\n" +
                "Bas gitarda Poyraz Kılıç, bateride Murat Cem Ergül, elektro Gitarda Özgür Özkan."};
       // detayListe = new int[] {R.string.detail_1, R.string.detail_2,R.string.detail_3, R.string.detail_4, R.string.detail_5};
        detayImageListe = new int[] {R.drawable.baris,R.drawable.erkin,R.drawable.mogollar,R.drawable.bulutsuzlukozlemi,R.drawable.cem,R.drawable.kurtalan,R.drawable.haluk,R.drawable.mfo,R.drawable.hurel,R.drawable.hayko};
        detayUrlListe = new String[] {"https://www.youtube.com/watch?v=711WqoPoeP0", "https://www.youtube.com/watch?v=18rJ43ehPEg&list=PLj2rZOL2Z_4NiOkkyT0zyoJSKP_NHZ2v3", "https://www.youtube.com/watch?v=_cpfNZyGyag&list=PL0-QnUNIAhGokl7RJ-pt2EVHQC_EikRKt", "https://www.youtube.com/watch?v=IXYMgx-HMN4&list=PLT4-qNzYrOXeM1Eh_JE6qM-JVWMzdGSZ-", "https://www.youtube.com/watch?v=gFNBjodRk50", "https://www.youtube.com/watch?v=yg9LsU1g-vw&list=PLEB151B8A70F3E6E2", "https://www.youtube.com/watch?v=vArQ3ajj30A&list=PLey6FrUs9NMnJZGG4lByx3Y2HnBhE3C3f&index=36", "https://www.youtube.com/watch?v=4DZbURvoDEc&list=PLgpTkBekPnOrew40F5M_rPXS3OVEsBvUj", "https://www.youtube.com/watch?v=JvFLBn1xBHI&list=PL_kScIuh-UMWubsR4Odp2CcAG5UEuKAYi", "https://www.youtube.com/watch?v=RTj7_HMCBeI&list=PL4SHFQEyFkKxychSk3SoInqjmUjwxwrTu"};

        detayPozisyon = getIntent().getIntExtra(pozisyonAnahtari, -1);


        if (detayPozisyon == -1) {
            Toast.makeText(DetayActivity.this, "Hata Var!", Toast.LENGTH_LONG).show();
        } else {
            //detayText.setText(detayListe[detayPozisyon]);
            detayText.setText(detayListe[detayPozisyon]);
            detayImage.setImageResource(detayImageListe[detayPozisyon]);
        }


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (detayPozisyon == -1) {
                    Toast.makeText(DetayActivity.this, "Hata Var!", Toast.LENGTH_LONG).show();
                } else {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(detayUrlListe[detayPozisyon]));
                    startActivity(i);
                }

            }
        });






    }
}

