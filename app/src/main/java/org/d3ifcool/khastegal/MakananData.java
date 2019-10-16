package org.d3ifcool.khastegal;

import java.util.ArrayList;

public class MakananData {

    private static String[] namaMakanan = {
            "Sega Lengko",
            "Kupat Bongkok",
            "Kupat Glabed",
            "Nasi Bogana",
            "Kemronyos",
            "Soto Tauco",
            "Nasi Ponggol",
            "Rujak Teplak",
            "Glotak",
            "Latopia",
            "Gemblong Ocar-Acir",
            "Tahu Aci",
            "Teh Poci"
    };

    private static String[] detailMakanan = {
            "Sega atau nasi Lengko adalah nasi yang terdiri dari macam-macam lauk seperti misalnya tahu dan tempe yang dipotong kotak, kol, tauge, sambal kacang serta renyahnya kerupuk.\n \nKarena kaya akan sayuran serta tahu dan tempe, makanan hemat ini kaya akan gizi, rendah kalori dan juga berprotein tinggi.\n \nWalaupun di kota lainnya di sekitar Pantura memiliki olahan yang serupa dengan sega lengko, namun makanan khas Tegal ini wajib kamu coba jika berkunjung.",
            "Makanan khas Tegal berikutnya yang tak kalah lezat bernama Kupat Bongkok. Olahan ini biasa dicari ketika musim mudik tiba karena biasa disantap bersama keluarga tercinta.\n \nOlahan berbahan dasar tempe yang dibusukkan (tempe semangit atau tempe bosok) ini harganya sangat terjangkau. Meskipun harganya murah, tempe yang digunakan memiliki kualitas yang baik karena meskipun sudah dibusukkan selama 3 hari rasanya malah lebih enak.",
            "Kupat glabed adalah salah satu makanan khas tegal yang cukup terkenal, masyarakat tegal menyebutnya sebagai makanan khas hari raya, makanan ini berasal dari desa Randugunting, tegal.\n \nMakanan kupat glabed ini hampir sama dengan kupat pada umumnya ini sangat cocok disantap dengan sate ayam atau lauk lainnya.",
            "Makanan khas Tegal ini sekilas mirip dengan nasi rames. Namun nasi bogana terdiri dari nasi putih yang lauknya bermacam-macam seperti kari ayam, opor ayam, telur pindang, dendeng, oseng tempe atau buncis, dan ditambah taburan bumbu serundeng.\n \nPenganan khas Tegal ini disajikan menggunakan daun pisang sehingga menambah kesan alami dan tentu rasanya pun semakin nikmat.",
            "Kemronyos merupakan sate khas tegal yang cara pengolahannya berbeda dengan sate-sate lainnya. Sate ini dibakar tanpa menggunakan bumbu, sehingga rasa yang tersaji benar-benar berasal dari cita rasa daging kambing itu sendiri.\n \nDalam penyajiannya, Anda bisa menikmatinya dengan sambal, kecap, dan sayuran yang disediakan.",
            "Soto khas Tegal ini bisa dibilang berbeda dengan soto-soto yang ada di daerah lainnya. Perbedaan soto ini karena rasanya manis, asam, dan asin yang berasal dari rasa dan aroma tauco.\n \nDalam semangkuk kecil soto ini, kita akan mendapatkan daging ayam yang disuwir-suwir, potongan babat rebus, tauge, bawang prei, brambang goreng, dan tauco.",
            "Nasi Ponggol ini biasa dijadikan menu sarapan pagi oleh masyarakat Tegal. Isiannya ada nasi yang di sajikan dengan beberapa lauk seperti sambal goreng tempe.\n \nKemudian dibungkus dengan daun pisang dalam porsi yang tidak begitu banyak.  Karena kepopulerannya, saat ini nasi ponggol tidak hanya dijual saat pagi, tapi juga malam hari.",
            "Rujak teplak ini memiliki sambal yang khas karena ada campuran singkongnya. Rujak teplak terdiri dari aneka macam sayuran mulai dari kangkung, daun singkong, pare, kol dan tauge. Makan rujak teplak semakin nikmat dengan kerupuk.",
            "Makanan dengan bahan utama gembus ini disebut glotak dikarenakan pada saat proses memasaknya menimbulkan suara glotak-glotak dari tulang ayam yang bergesekan dengan panci. Glotak semakin sedap oleh tambahan beberapa rawit dan kerupuk antor atau kerupuk mie goreng.",
            "Jalan-jalan ke Tegal jangan sampai melewatkan jajanan khas yang sudah sangat terkenal ini. Jajanan khas latopia terbuat dari tepung terigu yang dicampur dengan bahan lainnya sebagai isi latopia, seperti kacang hijau, cokelat dan strawberry.",
            "Namanya kuliner ini unik ya gan, Gemblong ocar-acir. Bahan utama jajanan ini terbuat dari ketan dengan topping kelapa yang sudah diparut dan gula aren yang sudah dicairkan.\n \nTidak sulit menemukan penjual gemblong ocar-acir, datang saja ke pasar tradisional kota Tegal dan kamu sudah bisa menikmati gurih dan lezatnya jajanan ini.",
            "Tahu Aci adalah salah satu kuliner yang tidak boleh teman-teman lewatkan bila mampir ke Tegal. Tahu aci terbuat dari tahu kuning persegi empat yang kemudian dibelah dua secara melintang.\n \nMasing-masing belahannya diberi adonan yang terbuat dari tepung kanji atau aci, potongan daun kucai, dan bumbu lainnya. Lalu di goring hingga warna kuning keemasan.",
            "Teh Tegal atau sering juga disebut teh Slawi, menjadi istimewa bila diseduh air panas dalam poci gerabah, aromanya menjadi khas Poci disajikan dengan gula batu.\n \nYang membuat rasanya menjadi seperti itu karena ketika teh diseduh air panas, gerabah yang berpori-pori itu bereaksi dengan teh dan menimbulkan aroma yang khas. Sebagian lagi menyukai teh jika disajikan dalam poci keramik atau porselen.\n \nBiasanya kegiatan menyeduh teh tersebut disebut moci, kegiatan moci sudah menjadi mentradisi bagi masyarakat Tegal dan sekitarnya."
    };

    private static int[] gambarMakanan = {
            R.drawable.segalengko,
            R.drawable.kupatbongkok,
            R.drawable.kupatglabed,
            R.drawable.nasibogana,
            R.drawable.kemronyos,
            R.drawable.sototauco,
            R.drawable.nasiponggol,
            R.drawable.rujakteplak,
            R.drawable.glotak,
            R.drawable.latopia,
            R.drawable.gemblongocaracir,
            R.drawable.tahuaci,
            R.drawable.tehpoci
    };

    static ArrayList<Makanan> getListData() {
        ArrayList<Makanan> list = new ArrayList<>();
        for (int position = 0; position < namaMakanan.length; position++) {
            Makanan makanan = new Makanan();
            makanan.setName(namaMakanan[position]);
            makanan.setDetail(detailMakanan[position]);
            makanan.setPhoto(gambarMakanan[position]);
            list.add(makanan);
        }
        return list;
    }

}
