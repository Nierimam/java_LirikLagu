/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lirik_lagu;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Lirik_lagu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        String nama,genre,lagu;
        int genre2,lagunasional,lagutradisional,lagulokal;
        
        System.out.println("                  Kelas : XII(RPL-2)     \n");
        System.out.println("=================  Nama Kelompok ===================");
        System.out.println("        1. Imam Mukhlash                      (16)      ");
        System.out.println("        2. Manbaul Fikri                      (19)      ");
        System.out.println("        3. I Gusti Ngurah Krisna Pranata Jaya (08)      ");
        System.out.println("        4. I Wayan Agus Weda Kusuma Putra     (15)      \n\n");
        
        
        System.out.print("Masukan Nama :");
        nama= in.nextLine();
        System.out.print("Pilihan : \n 1.Lagu Wajib Nasional \n 2.Lagu Tradisional \n 3.Lagu Lokal \n Pilih :");
        genre2 = in.nextInt();
        
        switch (genre2){
            case 1:
                    System.out.print("Pilihan Lagu Wajib Nasional : \n 1.Indonesia Raya \n 2.Bagimu Negeri \n 3.Pancasila \n 4.Ibu Pertiwi \n 5.Satu Nusa Satu Bangsa \n Pilih :");
                    lagunasional = in.nextInt();
                    System.out.println("\n"+"SELAMAT DATANG" +" "+nama+" "+"\n"+"Anda memilih genre Lagu Wajib Nasional" );
                    switch(lagunasional){
                        case 1 :
                            System.out.println("\n"+" Anda Memilih Lirik Lagu Indonesi Raya Berikut ini lirik nya :"+"\n"+"\n"+"Indonesia\n" +
                            "Tanah Air ku\n" +
                            "Tanah Tumpah Darah ku\n" +
                            "\n" +
                            "Di sana lah aku berdiri\n" +
                            "Jadi pandu Ibuku\n" +
                            "Indonesia Kebangsaan ku\n" +
                            "Bangsa dan Tanah Air ku\n" +
                            "Marilah kita berseru:\n" +
                            "Indonesia bersatu!\n" +
                            "\n" +
                            "Hiduplah tanahku\n" +
                            "Hiduplah negeriku\n" +
                            "Bangsaku Rakyatku\n" +
                            "Semuanya\n" +
                            "\n" +
                            "Bangunlah jiwanya\n" +
                            "Bangunlah badannya\n" +
                            "Untuk Indonesia Raya\n" +
                            "\n" +
                            "Indonesia Raya\n" +
                            "Merdeka! Merdeka!\n" +
                            "Tanah ku Negeriku\n" +
                            "Yang ku cinta\n" +
                            "Indonesia Raya\n" +
                            "Merdeka! Merdeka!\n" +
                            "Hiduplah\n" +
                            "Indonesia Raya"+"\n"+"\n");
                             break;
                            
                        case 2:
                            System.out.println("\n"+" Anda Memilih Lirik Lagu Bagimu Negri Berikut ini lirik nya :"+"\n"+"\n"+"Padamu negeri kami berjanji\n" +
                            "Padamu negeri kami berbakti\n" +
                            "Padamu negeri kami mengabdi\n" +
                            "Bagimu negeri jiwa raga kami\n");
                            break;
                            
                        case 3:
                            System.out.println("\n"+" Anda Memilih Lirik Lagu Pancasila Berikut ini lirik nya :"+"\n"+"\n"+"Garuda pancasila\n" +
                            "Akulah pendukungmu\n" +
                            "Patriot proklamasi\n" +
                            "Sedia berkorban untukmu\n" +
                            "\n" +
                            "Pancasila dasar negara\n" +
                            "Rakyat adil makmur sentosa\n" +
                            "Pribadi bangsaku\n" +
                            "\n" +
                            "Ayo maju maju\n" +
                            "Ayo maju maju\n" +
                            "Ayo maju maju\n");
                            break;
                         
                        case 4 : 
                            System.out.println("\n"+" Anda Memilih Lirik Lagu Ibu Pertiwi Berikut ini lirik nya :"+"\n"+"\n"+"Kulihat ibu pertiwi\n" +
                            "Sedang bersusah hati\n" +
                            "Air matamu berlinang\n" +
                            "Mas intanmu terkenang\n" +
                            "\n" +
                            "Hutan gunung sawah lautan\n" +
                            "Simpanan kekayaan\n" +
                            "Kini ibu sedang susah\n" +
                            "Merintih dan berdoa\n" +
                            "\n" +
                            "Kulihat ibu pertiwi\n" +
                            "Kami datang berbakti\n" +
                            "Lihatlah putra-putrimu\n" +
                            "Menggembirakan ibu\n" +
                            "\n" +
                            "Ibu kami tetap cinta\n" +
                            "Putramu yang setia\n" +
                            "Menjaga harta pusaka\n" +
                            "Untuk nusa dan bangsa\n");
                            break;
                        
                        case 5 :
                             System.out.println("\n"+" Anda Memilih Lirik Lagu Satu Nusa Satu Bangsa Berikut ini lirik nya :"+"\n"+"\n"+"Satu nusa\n" +
                                "Satu bangsa\n" +
                                "Satu bahasa kita\n" +
                                "\n" +
                                "Tanah air\n" +
                                "Pasti jaya\n" +
                                "Untuk Slama lamanya\n" +
                                "\n" +
                                "Indonesia pusaka\n" +
                                "Indonesia tercinta\n" +
                                "Nusa bangsa\n" +
                                "Dan Bahasa\n" +
                                "Kita bela bersama\n");
                            break;
                    }
                    
            break;
            case 2 :
                    System.out.print("Pilihan Lagu Tradisional : \n 1. Papua: Yamko Rambe Yamko \n 2. Bali: Mejangeran \n 3. Jawa Timur: Rek Ayo Rek \n 4. Solo : Stasiun Balapan \n 5. Jakarta : Hujan Gerimis \n Pilih :");
                    lagutradisional = in.nextInt();
                     System.out.println("\n"+"SELAMAT DATANG" +" "+nama+" "+"\n"+"Anda memilih genre Lagu Tradisional" );
                     switch(lagutradisional){
                        case 1 :
                            System.out.println("\n"+" Anda Memilih Lirik Lagu Yamko Rambe Yamko Berikut ini lirik nya :"+"\n"+"\n"+"Hee yamko rambe yamko aronawa kombe\n" +
                            "\n" +
                            "Hee yamko rambe yamko aronawa kombe\n" +
                            "Teemi nokibe kubano ko bombe ko\n" +
                            "\n" +
                            "Yuma no bungo awe ade\n" +
                            "\n" +
                            "Teemi nokibe kubano ko bombe ko\n" +
                            "\n" +
                            "Yuma no bungo awe ade\n" +
                            "Hongke hongke hongke riro\n" +
                            "\n" +
                            "Hongke jombe jombe riro\n" +
                            "\n" +
                            "Hongke hongke hongke riro\n" +
                            "\n" +
                            "Hongke jombe jombe riro");
                             break;
                            
                        case 2:
                            System.out.println("\n"+" Anda Memilih Lirik Lagu Mejangeran Berikut ini lirik nya :"+"\n"+"\n"+"Jangi Janger,  sengsenge sengseng janger,\n" +
                            "Sengsenge sengseng janger.\n" +
                            "Serere nyo mane nyore\n" +
                            "Kelap kelap ngalap bunga\n" +
                            "\n" +
                            "Langsing lanjar pamulune nyandat gading\n" +
                            "Saluat jani mejangeran\n" +
                            "Seriang ngentur rora roti\n" +
                            "\n" +
                            "Jangi Janger,  sengsenge sengseng janger,\n" +
                            "Sengsenge sengseng janger.\n" +
                            "Serere nyo mane nyore\n" +
                            "Kelap kelap ngalap bunga\n" +
                            "\n" +
                            "Langsing lanjar pamulune nyandat gading\n" +
                            "Saluat jani mejangeran\n" +
                            "Seriang ngentur rora roti\n" +
                            "\n" +
                            "Arasijak Jangi Janger\n" +
                            "Arasijak Jangi Janger\n" +
                            "Arasijak Jangi Janger\n" +
                            "Arasijak Jangi Janger");
                            break;
                            
                        case 3:
                            System.out.println("\n"+" Anda Memilih Lirik Lagu Rek Ayo Rek Berikut ini lirik nya :"+"\n"+"\n"+"Rek ayo rek mlaku mlaku nang tunjungan\n" +
                            "Rek ayo rek rame rame bebarengan\n" +
                            "Mangan tahu jadhi campur nganggo timun\n" +
                            "Malam minggu gak apik dhigawa nglamun\n" +
                            "Ngalor ngidur liwat took numpak motor\n" +
                            "Masih untung nyenggal nyenggol ati lega\n" +
                            "Sapa ngerti nasib awak lagi mujur\n" +
                            "Kenal anak e sing dodol rujak cingur\n" +
                            "Ja dhipikir kon padha gak duwe sangu\n" +
                            "Ja dhipikir angger padha gelem melu aku\n" +
                            "Cah ayo cah sapa gelem melu aku\n" +
                            "Cah ayo cah golek kenalan cah ayu");
                            break;
                         
                        case 4 : 
                            System.out.println("\n"+" Anda Memilih Lirik Lagu Stasiun Balapan Berikut ini lirik nya :"+"\n"+"\n"+"Ning Stasiun Balapan\n" +
                            "Kuto Solo Sing Dadi Kenangan\n" +
                            "Kowe Karo Aku\n" +
                            "Naliko Ngeterke Lungamu\n" +
                            "Ning Stasiun Balapan\n" +
                            "Rasane Koyo Wong Kelangan\n" +
                            "Kowe Ninggal Aku\n" +
                            "Ra Kroso Netes Eluh Ning Pipiku\n" +
                            "Da… Dada Sayang\n" +
                            "Da… Slamat Jalan\n" +
                            "Janji Lungo Mung Sedelo\n" +
                            "Jare Sewulan Ra Ono\n" +
                            "Pamitmu Naliko Semono\n" +
                            "Ning Stasiun Balapan Solo\n" +
                            "Janji Lungo Mung Sedelo\n" +
                            "Malah Tanpo Kirim Warto\n" +
                            "Lali Opo Pancen Nglali\n" +
                            "Yen Eling Mbok Enggal Bali\n" +
                            "Ning Stasiun Balapan\n" +
                            "Kuto Solo Sing Dadi Kenangan\n" +
                            "Janji Lungo Mung Sedelo\n" +
                            "Jare Sewulan Ra Ono\n" +
                            "Pamitmu Naliko Semono\n" +
                            "Ning Stasiun Balapan Solo\n" +
                            "Janji Lungo Mung Sedelo\n" +
                            "Malah Tanpo Kirim Warto\n" +
                            "Lali Opo Pancen Nglali\n" +
                            "Yen Eling Mbok Enggal Bali\n" +
                            "Ning Stasiun Balapan\n" +
                            "Kuto Solo Sing Dadi Kenangan");
                            break;
                        
                        case 5 :
                             System.out.println("\n"+" Anda Memilih Lirik Lagu Hujan Gerimis Berikut ini lirik nya :"+"\n"+"\n"+"eh ujan gerimis aje\n" +
                                "ikan teri diasinin\n" +
                                "eh jangan menangis aje\n" +
                                "yang pergi jangan dipikirin\n" +
                                "\n" +
                                "eh ujan gerimis aje\n" +
                                "ikan lele ade kumisnye\n" +
                                "eh jangan ngelamun aje\n" +
                                "kalo bole cari gantinye\n" +
                                "\n" +
                                "mengapa ujan gerimis aje\n" +
                                "pergi berlayar ke tanjung cina\n" +
                                "mengapa adek menangis aje\n" +
                                "kalo udah jodoh gak kemana\n" +
                                "oiy oiy\n" +
                                "\n" +
                                "eh ujan gerimis aje\n" +
                                "ikan bawal diasinin\n" +
                                "eh jangan menangis aje\n" +
                                "bulan syawal mau dikawinin\n" +
                                "\n" +
                                "jalan-jalan ke menado\n" +
                                "jangan lupa membeli pala\n" +
                                "kalo niat mencari jodoh\n" +
                                "cari yang item seperti saya");
                            break;
                    }
                    
            break;
            case 3 :
                    System.out.print("Pilihan genre Lagu Lokal : \n 1.Ratu Anom \n 2.Meong Meong \n 3.Ketut Garing \n 4.Putri Cening Ayu \n 5.Dadong Dauh \n Pilih : ");
                    lagulokal = in.nextInt();
                    System.out.println("\n"+"SELAMAT DATANG" +" "+nama+" "+"\n"+"Anda memilih genre Lagu Lokal" );
                    switch(lagulokal){
                        case 1 :
                            System.out.println("\n"+" Anda Memilih Lirik Lagu Ratu Anom Berikut ini lirik nya :"+"\n"+"\n"+"Ratu anom metangi meilen-ilen\n" +
                            "Ratu anom metangi meilen-ilen\n" +
                            "Dong pirengang munyin sulinge di jaba\n" +
                            "Dong pirengang munyin sulinge di jaba\n" +
                            "\n" +
                            "Enyen ento menyuling di jaba tengah\n" +
                            "Enyen ento menyuling di jaba tengah\n" +
                            "\n" +
                            "Gusti Ngurah Alit Jambe Pemecutan\n" +
                            "Gusti Ngurah Alit Jambe Pemecutan");
                             break;
                            
                        case 2:
                            System.out.println("\n"+" Anda Memilih Lirik Lagu Meong Meong Berikut ini lirik nya :"+"\n"+"\n"+"Meong meong alih je bikule (2x)\n" +
                            "Bikul gede gede\n" +
                            "Buin mokoh mokoh\n" +
                            "Kereng pesan ngerusuhin");
                            break;
                            
                        case 3:
                            System.out.println("\n"+" Anda Memilih Lirik Lagu Ketut Garing Berikut ini lirik nya :"+"\n"+"\n"+"Niki gending, gendingan nak bali\n" +
                            "Ngelimuran manah ngalih anak bajang\n" +
                            "Nemu anak truna meparab i ketut garing\n" +
                            "Ketut garing nyeneng di mengwi\n" +
                            "Raras cara kuta semu cara badung\n" +
                            "Tindak cara tabanan tayungane cara den bukit\n" +
                            "Cara den bukit, nganutin den bukit\n" +
                            "Boya tiang boya tiang wong kadungu\n" +
                            "Tiang juru pencar diarep tiange dungki\n" +
                            "Dungki cenik misi be kepiting\n" +
                            "Adepa di klating banga pipis satak\n" +
                            "Bange pipis satus nanggu satus tigang benang\n" +
                            "Ketut garing nyeneng di mengwi\n" +
                            "Raras cara kuta semu cara badung\n" +
                            "Tindak cara tabanan tayungane cara den bukit\n" +
                            "Cara den bukit, nganutin den bukit\n" +
                            "Boya tiang boya tiang wong kadungu\n" +
                            "Tiang juru pencar diarep tiange dungki\n" +
                            "Ketut garing nyeneng di mengwi\n" +
                            "Raras cara kuta semu cara badung\n" +
                            "Tindak cara tabanan tayungane cara den bukit\n" +
                            "Cara den bukit, nganutin den bukit\n" +
                            "Boya tiang boya tiang wong kadungu\n" +
                            "Tiang juru pencar diarep tiange dungki\n" +
                            "Dungki cenik misi be kepiting\n" +
                            "Adepa di klating banga pipis satak\n" +
                            "Bange pipis satus nanggu satus tigang benang\n" +
                            "Bange pipis satus nanggu satus tigang benang\n" +
                            "Bange pipis satus nanggu satus tigang benang");
                            break;
                         
                        case 4 : 
                            System.out.println("\n"+" Anda Memilih Lirik Lagu Putri Cening Ayu Berikut ini lirik nya :"+"\n"+"\n"+"Cening putri ayu Ngijeng Cening jumah\n" +
                            "Memeluas malu Ke peken meb'lanje\n" +
                            "Apang ade daharan nasi\n" +
                            "\n" +
                            "Memetiang ngiring Nongos ngijeng jumah\n" +
                            "Sambilan mekumpul Ajak titiang dadue\n" +
                            "Ditekani nyenggap gapin\n" +
                            "\n" +
                            "Pelalian Cening Kotak wadah gerip\n" +
                            "Jaje megenepan Ane luwung luwung\n" +
                            "Bunge melah melah Ambunane sarwe miyik");
                            break;
                        
                        case 5 :
                             System.out.println("\n"+" Anda Memilih Lirik Lagu Dadong Dauh Berikut ini lirik nya :"+"\n"+"\n"+"Dadong dauh ngelah siap putih\n" +
                            "Suba metaluh reka\n" +
                            "Minab ada limolas taluhne\n" +
                            "Nangih lacur ada nak nepukin\n" +
                            "Anak cerik cerik\n" +
                            "Anak cerik cerik\n" +
                            "Keliwat usil ipun");
                            break;
                    }
                    
            break;
        }
   
        
        
        
        
    }
    
}
