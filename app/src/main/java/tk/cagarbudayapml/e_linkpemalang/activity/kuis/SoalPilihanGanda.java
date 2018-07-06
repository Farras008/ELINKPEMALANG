package tk.cagarbudayapml.e_linkpemalang.activity.kuis;

public class SoalPilihanGanda {

    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "Landasan hukum bagi benda-benda sejarah yang disebut cagar budaya adalah ?",
            "GKJ Moga adalah salah satu cagar budaya di daerah Pemalang, tepatnya berada di kecamatan ?",
            "Satuan ruang geografis yang memiliki dua Situs atau lebih yang letaknya berdekatan dan/atau memperlihatkan ciri tata ruang yang khas disebut ?",
            "Piring Keramik merupakan salah satu benda cagar budaya yang bercorak cina yang merupakan peninggalan pada masa ?",
            "Lampu Sebayan adalah contoh benda cagar budaya yang dimiliki?",
            "Berapa Cagar Budaya yang dimiliki Kabupaten Pemalang ?",
            "Gua jepang merupakan Bangunan Cagar Budaya peninggalan Jepang yang terletak di kecamatan ? ",
            "Yang merupakan cagar budaya yang terletak di daerah Widuri adalah ?",
            "Pemalang merupakan kabupaten yang terletak di provinsi?",
            "Pabrik gula yang termasuk bangunan cagar budaya di daerah Pemalang adalah"
    };

    //membuat array untuk pilihan jawaban
    private String pilihanJawaban[][] = {
            {"UU N0.11 Tahun 2010","UU No.13 Tahun 2012","Pasal 1 Ayat 1 UUD 1945"},
            {"Randudongkal","Moga","Bantarbolang"},
            {"Kawasan Cagar Budaya","Struktur Cagar Budaya","Bangunan Cagar Budaya"},
            {"Hindia-Belanda","Dinasti Ming","Dinasti Syailendra"},
            {"PT. KAI","PT. Kamandaka","PT.Kaligung"},
            {"50 Cagar Budaya","92 Cagar Budaya","91 Cagar Budaya"},
            {"Randudongkal","Watukumpul","Moga"},
            {"Makam Belanda","Pegadaian Comal","Batu Tapak Kaki"},
            {"Jawa Tengah","Jawa Timur","Kalimantan Utara"},
            {"PG Sumberharjo","PG Jatinegara","PG Sragen"}
    };

    //membuat array untuk jawaban benar
    private String jawabanBenar[] = {
            "UU N0.11 Tahun 2010",
            "Moga",
            "Kawasan Cagar Budaya",
            "Dinasti Ming",
            "PT. KAI",
            "92 Cagar Budaya",
            "Watukumpul",
            "Makam Belanda",
            "Jawa Tengah",
            "PG Sumberharjo",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
