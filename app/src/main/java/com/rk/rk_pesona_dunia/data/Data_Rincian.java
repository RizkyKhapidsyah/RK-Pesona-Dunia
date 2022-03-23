package com.rk.rk_pesona_dunia.data;

import com.rk.rk_pesona_dunia.R;

import java.util.ArrayList;

public class Data_Rincian {
    private static String[] namaNamaNegara = {
            "Turki",
            "Belanda",
            "Italia",
            "Arab Saudi"
            // Data Akan Bertambah
    };

    private static String[] rincianNegara = {
            "Republik Turki (bahasa Turki: Türkiye Cumhuriyeti), juga hanya disebut sebagai Turki, adalah sebuah negara di kawasan Eurasia. Wilayahnya terbentang dari Semenanjung Anatolia di Asia Barat Daya hingga daerah Balkan di Eropa Tenggara. Turki berbatasan dengan Laut Hitam di sebelah utara; Bulgaria di sebelah barat laut; Yunani dan Laut Aegea di sebelah barat; Georgia di timur laut; Armenia, Azerbaijan, dan Iran di sebelah timur; Irak dan Suriah di tenggara; dan Laut Mediterania di sebelah selatan. Laut Marmara yang merupakan bagian dari Turki digunakan untuk menandai batas wilayah benua Eropa dan benua Asia, sehingga Turki dikenal sebagai negara transkontinental. (WikiPedia)",
            "Belanda adalah sebuah negara yang sebagian besar terletak di Benua Eropa. Belanda merupakan bagian dari Kerajaan Belanda, sebuah negara monarki konstitusional yang mencakup seluruh bagian Belanda Eropa serta Belanda Karibia. Belanda terdiri dari dua belas provinsi di Eropa Barat dan tiga pulau teritori di Karibia. Belanda Eropa berbatasan dengan Laut Utara di utara dan barat, Belgia di selatan, dan Jerman di timur, serta berbagi perbatasan maritim dengan Belgia, Jerman, dan Britania Raya. Belanda menganut sistem pemerintahan demokrasi parlementer yang disusun sebagai negara kesatuan. Ibu kota dan kota terbesarnya adalah Amsterdam, sedangkan pusat pemerintahan dan kedudukan monarkinya berada di Den Haag.[12] Belanda sebagai keseluruhan sering kali disebut Holland meskipun istilah tersebut hanya mencakup provinsi Holland Utara dan Holland Selatan. (WikiPedia)",
            "Italia atau nama resminya Republik Italia (bahasa Italia: Repubblica Italiana), adalah sebuah negara kesatuan republik parlementer di Eropa Terletak di jantung Laut Mediterania. Italia berbatasan dengan Prancis, Swiss, Austria, Slovenia, San Marino dan Vatikan. Italia mencakup area seluas 301.338 km² (116.347 mi²), dan dipengaruhi oleh iklim sedang dan iklim mediterania. Dilihat dari bentuknya, peta Italia berbentuk seperti sepatu bot atau di Italia sering disebut lo Stivale. Dengan jumlah penduduk mencapai 61 juta jiwa, Italia merupakan negara anggota Uni Eropa ketiga yang paling banyak penduduknya setelah Jerman dan Prancis.",
            "Arab Saudi atau secara resmi dikenal sebagai Kerajaan Arab Saudi atau Kingdom of Saudi Arabia (KSA), adalah sebuah negara Arab di Asia Barat yang mencakup hampir keseluruhan wilayah Semenanjung Arabia. Dengan luas wilayah kira-kira 2,150,000 km2 (830,000 sq mi), Arab Saudi secara geografis merupakan negara terbesar ke lima di Asia dan kedua terbesar di Dunia Arab setelah Aljazair. Arab Saudi berbatasan langsung dengan Yordania dan Irak ke utara, Kuwait ke timur laut, Qatar, Bahrain, dan Uni Emirat Arab ke timur, Oman ke tenggara, dan Yaman ke selatan. Data_GetterSetter ini terpisah dengan Israel dan Mesir oleh Teluk Aqaba. Data_GetterSetter ini adalah satu-satunya negara yang memiliki dua pesisir penting, yakni Laut Merah dan Teluk Persia, dan sebagian besar wilayah Arab Saudi merupakan gurun pasir."
            // Data Akan Bertambah
    };

    private static int[] gambarBenderaNegara = {
            R.drawable.bendera_turki,
            R.drawable.bendera_belanda,
            R.drawable.bendera_italia,
            R.drawable.bendera_arab_saudi
    };

    public static ArrayList<Data_GetterSetter> dapatkanListDataNegara() {
        ArrayList<Data_GetterSetter> L = new ArrayList<>();
        for (int X = 0; X < namaNamaNegara.length; X++) {
            Data_GetterSetter N = new Data_GetterSetter();
            N.setNamaNegara(namaNamaNegara[X]);
            N.setRincianNegara(rincianNegara[X]);
            N.setFotoBenderaNegara(gambarBenderaNegara[X]);
            L.add(N);
        }
        return L;
    }

    private static String[] namaNamaDestinasiWisata = {
            "Blue Mosque",              //Turki
            "Galata Bridge",            //Turki
            "Cappadocia",               //Turki
            "Goreme",                   //Turki
            "Topkapı Palace",           //Turki
            "Istiklal Street",          //Turki
            "Pamukkale",                //Turki
            "Bursa",                    //Turki
            "Blue Lagoon",              //Turki
            "Fethiye",                  //Turki
            "Museum Rijksmuseum",       //Belanda
            "Taman Bunga Keukenhof",    //Belanda
            "Leiden Canals",            //Belanda
            "Natura Artis Magistra",    //Belanda
            "Kanal Amsterdam",          //Belanda
            "Taman Vondelpark",         //Belanda
            "De Waag",                  //Belanda
            "Bloemenmarkt",             //Belanda
            "West Frisian Island",      //Belanda
            "Museum Van Gogh",          //Belanda
            "Colosseum",                //Italia
            "Fontana Di Trevi",         //Italia
            "Pantheon",                 //Italia
            "Roman Forum",              //Italia
            "Vatican Museums",          //Italia
            "Via Appia",                //Italia
            "Villa Borghese Gardens",   //Italia
            "Venesia",                  //Italia
            "The Rialto Bridge Market", //Italia
            "Campo de' Fiori",          //Italia
            "Gua Hira",                 //Arab Saudi
            "Masjid Jawatha",           //Arab Saudi
            "Masjid Quba",              //Arab Saudi
            "Jabal Al-Lawz",            //Arab Saudi
            "Madain Saleh / Hegra",     //Arab Saudi
            "Jabal Uhud",               //Arab Saudi
            "Air Mancur King Fahd",     //Arab Saudi
            "Albatul Marine / Jeddah",  //Arab Saudi
            "Masjid Al-Qiblatain",      //Arab Saudi
            "Jannat al-Baqi"            //Arab Saudi
    };

    private static int[] gambarDestinasiWisata_Turki = {
            R.drawable.turki_blue_mosque_01,
            R.drawable.turki_blue_mosque_02,
            R.drawable.turki_blue_mosque_03,
            R.drawable.turki_blue_mosque_04,
            R.drawable.turki_blue_mosque_05,
            R.drawable.turki_blue_mosque_06,
            R.drawable.turki_blue_mosque_07,
            R.drawable.turki_galata_bridge_01,
            R.drawable.turki_galata_bridge_02,
            R.drawable.turki_galata_bridge_03,
            R.drawable.turki_galata_bridge_04,
            R.drawable.turki_galata_bridge_05,
            R.drawable.turki_galata_bridge_06,
            R.drawable.turki_galata_bridge_07,
            R.drawable.turki_cappadocia_01,
            R.drawable.turki_cappadocia_02,
            R.drawable.turki_cappadocia_03,
            R.drawable.turki_cappadocia_04,
            R.drawable.turki_cappadocia_05,
            R.drawable.turki_cappadocia_06,
            R.drawable.turki_cappadocia_07,
            R.drawable.turki_goreme_01,
            R.drawable.turki_goreme_02,
            R.drawable.turki_goreme_03,
            R.drawable.turki_goreme_04,
            R.drawable.turki_goreme_05,
            R.drawable.turki_goreme_06,
            R.drawable.turki_goreme_07,
            R.drawable.turki_topkapi_palace_01,
            R.drawable.turki_topkapi_palace_02,
            R.drawable.turki_topkapi_palace_03,
            R.drawable.turki_topkapi_palace_04,
            R.drawable.turki_topkapi_palace_05,
            R.drawable.turki_topkapi_palace_06,
            R.drawable.turki_topkapi_palace_07,
            R.drawable.turki_istiklal_street_01,
            R.drawable.turki_istiklal_street_02,
            R.drawable.turki_istiklal_street_03,
            R.drawable.turki_pamukkale_01,
            R.drawable.turki_pamukkale_02,
            R.drawable.turki_pamukkale_03,
            R.drawable.turki_pamukkale_04,
            R.drawable.turki_pamukkale_05,
            R.drawable.turki_pamukkale_06,
            R.drawable.turki_pamukkale_07,
            R.drawable.turki_bursa_01,
            R.drawable.turki_bursa_02,
            R.drawable.turki_blue_lagoon_01,
            R.drawable.turki_blue_lagoon_02,
            R.drawable.turki_blue_lagoon_03,
            R.drawable.turki_blue_lagoon_04,
            R.drawable.turki_fethiye_01,
            R.drawable.turki_fethiye_02,
            R.drawable.turki_fethiye_03,
    };

    private static int[] GambarDestinasiWisata_Belanda = {
            R.drawable.belanda_museum_rijksmuseum_01,
            R.drawable.belanda_museum_rijksmuseum_02,
            R.drawable.belanda_museum_rijksmuseum_03,
            R.drawable.belanda_museum_rijksmuseum_04,
            R.drawable.belanda_museum_rijksmuseum_05,
            R.drawable.belanda_museum_rijksmuseum_06,
            R.drawable.belanda_museum_rijksmuseum_07,
            R.drawable.belanda_taman_bunga_keukenhof_01,
            R.drawable.belanda_taman_bunga_keukenhof_02,
            R.drawable.belanda_taman_bunga_keukenhof_03,
            R.drawable.belanda_taman_bunga_keukenhof_04,
            R.drawable.belanda_taman_bunga_keukenhof_05,
            R.drawable.belanda_taman_bunga_keukenhof_06,
            R.drawable.belanda_leiden_canals_01,
            R.drawable.belanda_natura_artis_magistra_01,
            R.drawable.belanda_natura_artis_magistra_02,
            R.drawable.belanda_natura_artis_magistra_03,
            R.drawable.belanda_kanal_amsterdam_01,
            R.drawable.belanda_kanal_amsterdam_02,
            R.drawable.belanda_kanal_amsterdam_03,
            R.drawable.belanda_kanal_amsterdam_04,
            R.drawable.belanda_kanal_amsterdam_05,
            R.drawable.belanda_kanal_amsterdam_06,
            R.drawable.belanda_taman_vondelpark_01,
            R.drawable.belanda_taman_vondelpark_02,
            R.drawable.belanda_taman_vondelpark_03,
            R.drawable.belanda_de_waag_01,
            R.drawable.belanda_de_waag_02,
            R.drawable.belanda_de_waag_03,
            R.drawable.belanda_bloemenmarkt_01,
            R.drawable.belanda_west_frisian_islands_01,
            R.drawable.belanda_west_frisian_islands_02,
            R.drawable.belanda_musem_van_gogh_01,
            R.drawable.belanda_musem_van_gogh_02,
    };

    private static int[] gambarDestinasiWisata_Italia = {
            R.drawable.italia_colosseum_01,
            R.drawable.italia_colosseum_02,
            R.drawable.italia_colosseum_03,
            R.drawable.italia_fontana_di_trevi_01,
            R.drawable.italia_fontana_di_trevi_02,
            R.drawable.italia_fontana_di_trevi_03,
            R.drawable.italia_pantheon_01,
            R.drawable.italia_pantheon_02,
            R.drawable.italia_pantheon_03,
            R.drawable.italia_pantheon_04,
            R.drawable.italia_roman_forum_01,
            R.drawable.italia_roman_forum_02,
            R.drawable.italia_roman_forum_03,
            R.drawable.italia_roman_forum_04,
            R.drawable.italia_roman_forum_05,
            R.drawable.italia_vatican_museums_01,
            R.drawable.italia_vatican_museums_02,
            R.drawable.italy_via_appia_01,
            R.drawable.italy_via_appia_02,
            R.drawable.italy_via_appia_03,
            R.drawable.italia_villa_borghese_gardens_01,
            R.drawable.italia_villa_borghese_gardens_02,
            R.drawable.italia_venesia_01,
            R.drawable.italia_venesia_02,
            R.drawable.italia_venesia_03,
            R.drawable.italia_venesia_04,
            R.drawable.italia_venesia_05,
            R.drawable.italia_the_rialto_bridge_and_market_01,
            R.drawable.italia_the_rialto_bridge_and_market_02,
            R.drawable.italia_campo_de_fiori_01,
            R.drawable.italia_campo_de_fiori_02,
            R.drawable.italia_campo_de_fiori_03,
    };

    private static int[] gambarDestinasiWisata_ArabSaudi = {
            R.drawable.arab_saudi_gua_hira_01,
            R.drawable.arab_saudi_gua_hira_02,
            R.drawable.arab_saudi_gua_hira_03,
            R.drawable.arab_saudi_masjid_jawatha_01,
            R.drawable.arab_saudi_masjid_jawatha_02,
            R.drawable.arab_saudi_masjid_quba_01,
            R.drawable.arab_saudi_masjid_quba_02,
            R.drawable.arab_saudi_masjid_quba_03,
            R.drawable.arab_saudi_masjid_quba_04,
            R.drawable.arab_saudi_jabal_al_lawz_01,
            R.drawable.arab_saudi_jabal_al_lawz_02,
            R.drawable.arab_saudi_jabal_al_lawz_03,
            R.drawable.arab_saudi_madain_saleh_hegra_01,
            R.drawable.arab_saudi_madain_saleh_hegra_02,
            R.drawable.arab_saudi_madain_saleh_hegra_03,
            R.drawable.arab_saudi_jabal_uhud_01,
            R.drawable.arab_saudi_jabal_uhud_02,
            R.drawable.arab_saudi_jabal_uhud_03,
            R.drawable.arab_saudi_jabal_uhud_04,
            R.drawable.arab_saudi_air_mancur_king_fahd_01,
            R.drawable.arab_saudi_air_mancur_king_fahd_02,
            R.drawable.arab_saudi_air_mancur_king_fahd_03,
            R.drawable.arab_saudi_air_mancur_king_fahd_04,
            R.drawable.arab_saudi_albatul_marine_01,
            R.drawable.arab_saudi_albatul_marine_02,
            R.drawable.arab_saudi_masjid_al_qiblatain_01,
            R.drawable.arab_saudi_masjid_al_qiblatain_02,
            R.drawable.arab_saudi_masjid_al_qiblatain_03,
            R.drawable.arab_saudi_jannat_al_baqi_01,
            R.drawable.arab_saudi_jannat_al_baqi_02,
            R.drawable.arab_saudi_jannat_al_baqi_03,
    };

}



