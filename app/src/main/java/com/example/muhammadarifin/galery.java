package com.example.muhammadarifin;

import android.content.Context;

import com.example.muhammadarifin.model.air_terjun;
import com.example.muhammadarifin.model.pantai;
import com.example.muhammadarifin.model.pengunungan;
import com.example.muhammadarifin.model.religi;
import com.example.muhammadarifin.model.wisata;

import java.util.ArrayList;
import java.util.List;

public class galery {
    private static List<wisata> wisatas = new ArrayList<>();

    private static List<air_terjun> initDataair_terjun() {
        List<air_terjun> air_terjuns = new ArrayList<>();
        air_terjuns.add(new air_terjun("Keindahan dua tingkat di Sendang Gile","Desa senaru ","erada di Desa Senaru yang terkenal, kamu harus berjalan menyusuri hutan dan sungai untuk bisa mencapai Sendang Gile. Tapi tenang saja, perjalanannya akan seru dan menyenangkan karena suasana sejuk pegunungan yang akan kamu nikmati. ",R.drawable.image5));
        air_terjuns.add(new air_terjun("Si Kembar dan Si Tinggi; Tiu Teja dan Tiu Sekeper","Desa Santong, Kecamatan Kayangan, Kabupaten Lombok Utara.","Teja dalam bahasa setempat berarti pelangi. Kamu bisa menemukan pelangi ini di bagian bawah air terjun saat sinar matahari bisa mencapainya. Tiu Teja juga merupakan air terjun kembar dengan dua aliran yang jatuh berdampingan. Alirannya cukup deras, airnya jernih dan sangat dingin.", R.drawable.t2));
        air_terjuns.add(new air_terjun("Kemegahan ampitheater alam di Tiu Kelep", "Desa Senaru, Kecamatan Bayan, Kabupaten Lombok Utara.", "Jadi, pada dasarnya air terjun ini memiliki dua tingkat. Air terjun utama dengan aliran terbesar jatuh langsung dari tingkat tertinggi. Sementara itu, tingkat bawahnya adalah sederet aliran yang lebih kecil di tebing. Semuanya jatuh ke kolam yang sama.",R.drawable.t3));
        air_terjuns.add(new air_terjun("Segar manisnya Air Terjun Jeruk Manis", "Desa Kembang Kuning, Kecamatan Sikur, Kabupaten Lombok Timur", "Masih di kaki Gunung Rinjani, Air Terjun Jeruk Manis berada di sisi timur lereng gunung berapi ini. Air terjun ini memang masih menjadi bagian dari Taman Nasional Gunung Rinjani. Konon, air terjun ini pertama kali ditemukan masyarakat sekitar pada pertengahan dekade 80-an.", R.drawable.t4));
        air_terjuns.add(new air_terjun("Kolam biru Air Terjun Umar Maya", "Desa Bilok Petung, Kecamatan Sembalun, Kabupaten Lombok Timur.", "Air terjun itu mengalir ke sebuah kolam alami yang luas. Warna airnya bervariasi, dari hijau toska hingga biru langit. Kolam ini seakan terpahat di bebatuan raksasa, membuat kamu akan ingat tentang legenda bidadari yang turun ke bumi.", R.drawable.t5));
        return air_terjuns;
    }

    private static List<pantai> initDatapantai() {
        List<pantai> pantais = new ArrayList<>();
        pantais.add(new pantai("Eksotisme Tanjung Bloam yang masih alami", "Jl. Pantai Beloam, Tanjung Ringgit, Jerowaru, Sekaroh, Lombok Timur.",
                "Lombok Timur punya banyak pantai indah, terutama di bagian tenggara. Meski belakangan banyak dilakukan pembangunan jalan, akses ke sebagian pantai di wilayah ini masih sangat sulit. Salah satu pantai yang wajib dikunjungi jika ke Lombok Timur adalah Tanjung Bloam (kadang juga disebut Tanjung Beloam).", R.drawable.pan));
        pantais.add(new pantai("Gili Kondo, pulau pasir nan menawan", "Labuhan Pandan, Sambelia. Lombok Timur:",
                "Gili Kondo adalah satu dari gugusan pulau kecil yang berada di Selat Alas. Artinya, pulau-pulau itu berada di antara Lombok dan Sumbawa. Seperti kebanyakan pulau kecil di sekitar Lombok, Gili Kondo juga sangat eksotis", R.drawable.pan2));
        pantais.add(new pantai("Tanjung Ringgit, keindahan yang belum tersentuh", "Jl. Lingkok Siwaq, Sekaroh, Jerowaru, Kabupaten Lombok Timur",
                "Berada di sudut tenggara Lombok, Tanjung Ringgit adalah pantai yang sangat unik. Kamu bisa menemukan berbagai keindahan yang berbeda di sini. Yang pertama ada tebing tinggi yang bertabrakan langsung dengan laut biru ", R.drawable.pan3));
        pantais.add(new pantai("Pasir merah muda menyala di Pantai Tangsi", "Desa Sekaroh, Kecamatan Jerowaru, Kabupaten Lombok Timur",
                "Tak banyak pantai di dunia ini yang memiliki pasir berwarna merah muda alias pink, tapi Indonesia punya beberapa, salah satunya ada di Lombok. Pantai Tangsi yang berada di Jerowaru memiliki warna alami merah muda yang memukau. Warna ini bisa tercipta karena perpaduan antara pasir putih dengan serpihan karang merah yang sudah mati. Di sini, kamu bisa melihat gradasi warna yang tiada duanya. Dimulai dari pasir putih, merah muda, menuju air laut toska, hingga biru gelap di kedalaman.", R.drawable.pan4));
        pantais.add(new pantai(" Menyeberang ke savana Gili Sunut","Dusun Temeak, Desa Pemongkong, Kecamatan Jerowaru, Kabupaten Lombok Timur",
                "Masih berada di Sekaroh, Jerowaru, kamu juga bisa menemukan sebuah pulau yang sangat unik; Gili Sunut. Keunikan pertama gili ini adalah aksesnya yang ‘fleksibel’", R.drawable.pan5));

        return pantais;
    }
    private static List<pengunungan> initDatapengunungan() {
        List<pengunungan> pengunungans = new ArrayList<>();
        pengunungans.add(new pengunungan(" Bukit Pergasingan", "sembalum lombok timur",
                "Pemandangan menakjubkan Lombok dan Rinjani dari ketinggian: Bukit Pergasingan", R.drawable.g1));
        pengunungans.add(new pengunungan("Bukit Batu Idung", "kampung Gumise, Gerung, Lombok Barat  ",
                "Untuk mencapai bukit ini, kita membutuhkan waktu satu jam perjalanan dari kota Mataram. Terletak di kampung Gumise, Gerung, Lombok Barat membuat pengunjung bukit ini kebanyakan dari wilayah Lombok Barat dan Kota Mataram", R.drawable.g2));
        pengunungans.add(new pengunungan("Bukit Pengawisan", "Desa Tawun, Kecamatan Sekotong, Lombok Barat",
                "Terletak di Desa Tawun, Kecamatan Sekotong, Lombok Barat, Bukit Pengawisan dapat ditempuh dengan kendaraan bermotor untuk mencapai puncaknya. Dari atas bukit anda dapat melihat pesisir pantai wilayah Sekotong dan beberapa pulau-pulau kecil. ", R.drawable.g3));
        pengunungans.add(new pengunungan("Bukit Anak Dara", " Desa Sembalun",
                "Terletak di Desa Sembalun juga, Bukit Anak Dara lebih tinggi daripada Bukit Pergasingan. Jika naik ke Bukit Pergasingan menempuh waktu selama 2 jam, Bukit Anak Dara bisa mencapai 3 jam.", R.drawable.g4));
        pengunungans.add(new pengunungan("Bukit Nanggi", "Desa sembalun",
                "Bukit Nanggi juga terletak di Desa Sembalun, Kabupaten Lombok Timur. Dibandingkan dengan Bukit Pergasingan dan Bukit Anak Dara, Bukit Nanggi menjadi bukit tertinggi di deretan bukit di Lombok pada artikel ini. Untuk mencapai puncak Bukit Nanggi, anda harus berjalan kaki soft trekking selama sekitar 4 jam", R.drawable.g5));

        return pengunungans;
    }
    private static List<religi> initData() {
        List<religi> religis = new ArrayList<>();
        religis.add(new religi("1. Makam yang Ada Di Masjid Kuno Bayan Baleq", "Desa Bayan, Kecamatan Bayan, Kabupaten Lombok Utara",
                "Masjid yang ada di Bayan ini merupakan salah satu bangunan yang menjadi saksi bisu akan perkembangan Islam di tanah Lombok. Di Masjid Kuno Bayan Balek ini terdapat sejumlah makam yang salah satu diantaranya adalah makam Abdul Rozak yang dianggap sebagai orang yang menyebarkan agama islam di Lombok.",R.drawable.re));
        religis.add(new religi(" Makam yang Ada Di Wali Nyatoq ", " Lombok Barat. ",
                "Menurut pendapat dari masyarakat setempat, Wali Nyatoq adalah salah satu wali yang namanya sudah melegenda di kawasan Lombok Barat. Kawasan pemakaman Wali Nyatoq ini tiap harinya ramai dikunjungi oleh para peziarah, khususnya pada hari Rabu. Keberadaan makam Wali Nyatoq ini dipercaya dapat menyelesaikan beragam permasalahan rakyat.", R.drawable.re2));
        religis.add(new religi(" Makam Muhammad Zaiduddin Abdul Madjid dan Makam Almagfurlah", "pancor,selong lombok timur",
                "Muhamad Zaiduddin A.M dan Almagfurlah dulunya adalah tokoh ulama yang menyebarkan agama islam di tanah Lombok ini. Tak hanya itu saja, kedua tokoh ini merupakan orang yang pemberani karena mereka tetap memperjuangkan penyebaran agama islam di tengah carut-marutnya negara Indonesia karena penjajahan Jepang. ", R.drawable.re3));
        religis.add(new religi("Mengenal Sejarah Kerajaan Selaparang Di Makam Selaparang", "Kecamatan Suwela, Kabupaten Lombok Timur,",
                "Sesuai dengan namanya, keberadaan makam Selaparang sangat erat hubungannya dengan Kerajaan Selaparang. Kerajaan Selaparang merupakan salah satu kerajaan Hindu yang ada di Indonesia, yang kejayaannya dimulai dari abad ke 13 hingga ke 16.", R.drawable.re4));
        religis.add(new religi("Berziarah Ke Makam Loang Baloq Lombok", "mataram",
                "Dalam bahasa Sasak, kata Loang Baloq mempunyai arti berupa pohon beringin yang berlubang. Hal ini disebabkan karena di kawasan pemakaman Loang Baloq ini terdapat pohon beringin yang sudah berumur ratusan tahun", R.drawable.re5));

        return religis;
    }

    private static void initAllwisatas() {
        wisatas.addAll(initData());
        wisatas.addAll(initDataair_terjun());
        wisatas.addAll(initDatapantai());
        wisatas.addAll(initDatapengunungan());
    }

    public static List<wisata> getAllwisata() {
        if (wisatas.size() == 0) {
            initAllwisatas();
        }
        return  wisatas;
    }

    public static List<wisata> getWisatasByTipe(String jenis) {
        List<wisata> wisatasByType = new ArrayList<>();
        if (wisatas.size() == 0) {
            initAllwisatas();
        }
        for (wisata h : wisatas) {
            if (h.getJenis().equals(jenis)) {
                wisatasByType.add(h);
            }
        }
        return wisatasByType;
    }

}
