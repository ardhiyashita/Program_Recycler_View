package com.example.myrecyclerview;

import java.util.ArrayList;

public class PaintsData {
    private static String[] paintNames = {
            "Guernica",
            "Liberty Leading the People",
            "The Raft of the Medusa",
            "Impression, Sunrise",
            "The Great Wave off Kanagawa",
            "The Scream",
            "Les Demoiselles d’Avignon",
            "The Persistence of Memory",
            "Mona Lisa"
    };

    private static String[] paintDetails = {
            "Salah satu karya paling penting di abad ke-20 karena menampilkan pengeboman kota Guernica pada tahun 1937 oleh Nazi dan pesawat Italia. Pablo Picasso ingin menunjukkan kengerian dan penderitaan bangsa Spanyol saat perang saudara gitu, jadi dia menggambarkan pemboman yang menyebabkan 2.000 orang tewas.",
            "Liberty Leading the People dilukis oleh pelukiS Romantis Eugène Delacroix di tahun 1930 dan ditampilkan di Salon de Paris pada tahun 1831. Awalnya disebut 'Scènes de barricades' mengacu pada Revolusi Juli yang mengikuti Revolusi Prancis.",
            "Lukisan ini menampilkan kejadian yang berlangsung pada tahun 1816 di di pantai Senegal. Karya ini awalnya disebut “Scène de Naufrage” (Shipwreck Scene) oleh Théodore Géricault. Fregat kerajaan hancur di pantai Afrika. Kaptennya, kurang berpengalaman, mengatur situasi dengan buruk; tidak ada cukup sekoci untuk jumlah pelaut dan petugas yang tersisa harus membangun rakit dengan material seadanya di atas kapal.",
            "Impression, Sunrise karya Monet dilukis pada tahun 1872 dan menandai awal mula gerakan Impresionis. Claude Monet mereplikasi pelabuhan di Le Havre dengan gaya yang benar-benar baru pada saat itu. Monet berfokus pada pemandangan sehari-hari seperti matahari terbit.",
            "Lukisan ini dibuat pada tahun 1830 atau 1831 selama periode Edo dan dikenal di Jepang sebagai The Great Wave atau The Wave. Ini adalah bagian dari serial yang dikenal sebagai “Thirty-six Views of Mount Fuji” dan terkenal karena penggunaan biru Prussia. Lukisan ini khususnya terkenal karena menyatukan cetakan Jepang tradisional dengan perspektif Barat.",
            "The Scream menampilkan sosok humanoid yang terlihat ngeri ke arah penonton. Latar belakangnya tidak terlalu tajak tapi Anda bisa melihat jembatan dan pagar dalam pusaran oranye dan biru. Anda juga bisa melihat siluet lainnya. unch seringkali digambarkan sebagai seniman yang disiksa. Dia terluka oleh peristiwa seperti kematian dini saudara perempuan dan ibunya, dan keluarganya juga punya riwayat masalah kesehatan mental.",
            "Awalnya berjudul 'Le Bordel d’Avignon' (The Avignon Brothel), karya oleh Picasso ini menandai kedatangan Kubisme. Picasso menerima surat dari Cézanne yang menyebutkan dunia terbuat dari kotak dan lingkaran. Seniman tersebut memutuskan untuk menggunakan istilah-istilah ini untuk merepresentasikan dunia menggunakan bentuk-bentuk geometris.",
            "Persistence of Memory, lukisan cat minyak ini menunjukkan pantai Portlligat dengan jam dinding yang meleleh di bawah matahari. Dali tampaknya menyebarkan ide bahwa kecemasan dan berlalunya waktu menjadi realita. Kebanyakan orang menyebutnya “Jam yang Meleleh”. Seniman ini rupanya terinspirasi oleh keju Camembert yang meleleh di ujung makanan.",
            "Mona Lisa, lukisan cat minyak ini menunjukkan pantai Portlligat dengan jam dinding yang meleleh di bawah matahari. Dali tampaknya menyebarkan ide bahwa kecemasan dan berlalunya waktu menjadi realita. Kebanyakan orang menyebutnya “Jam yang Meleleh”. Seniman ini rupanya terinspirasi oleh keju Camembert yang meleleh di ujung makanan."
    };

    private static int[] paintImage = {
            R.drawable.guernica,
            R.drawable.liberty,
            R.drawable.medusa,
            R.drawable.sunrise,
            R.drawable.kanagawa,
            R.drawable.scream,
            R.drawable.avignon,
            R.drawable.memory,
            R.drawable.monalisa
    };

    static ArrayList<Paint> getListData() {
        ArrayList<Paint> list = new ArrayList<>();
        for (int position = 0; position < paintNames.length; position++) {
            Paint paint = new Paint();
            paint.setPaint_name(paintNames[position]);
            paint.setDetail(paintDetails[position]);
            paint.setPhoto(paintImage[position]);
            list.add(paint);
        };
        return list;
    };
}
