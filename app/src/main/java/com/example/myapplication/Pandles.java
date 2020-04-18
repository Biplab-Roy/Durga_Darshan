package com.example.myapplication;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class Pandles {

    static public ArrayList<LatLng> southPandles = new ArrayList<>();
    static public ArrayList<Integer> southrating = new ArrayList<>();
    static public ArrayList<String> PandleNames = new ArrayList<>();

    public static ArrayList<String> setSouthPandles() {

        if(southPandles.size()==0) {
            southPandles.add(new LatLng(22.509331, 88.333985));
            PandleNames.add("Suruchi Sangha");
            southrating.add(5);
            southPandles.add(new LatLng(22.516663, 88.337110));
            PandleNames.add("Chetla Agrani Club");
            southrating.add(4);
            southPandles.add(new LatLng(22.518185, 88.342693));
            PandleNames.add("66 Pally Durga Puja Pandal");
            southrating.add(4);
            southPandles.add(new LatLng(22.518054, 88.343729));
            PandleNames.add("Badamtala Ashar Sangha");
            southrating.add(4);
            southPandles.add(new LatLng(22.517102, 88.345056));
            PandleNames.add("Shib Mandir");
            southrating.add(4);
            southPandles.add(new LatLng(22.518575, 88.353422));
            PandleNames.add("Deshapriya Park");
            southrating.add(4);
            southPandles.add(new LatLng(22.519611, 88.355430));
            PandleNames.add("Tridhara Sammilani");
            southrating.add(5);
            southPandles.add(new LatLng(22.515982, 88.355743));
            PandleNames.add("Ballygunge Cultural Association");
            southrating.add(5);
            southPandles.add(new LatLng(22.515591, 88.355923));
            PandleNames.add("Samaj Sebi Sangha");
            southrating.add(3);
            southPandles.add(new LatLng(22.517698, 88.362033));
            PandleNames.add("Hindustan Park Sarbojanin Durga Puja");
            southrating.add(4);
            southPandles.add(new LatLng(22.521263, 88.363060));
            PandleNames.add("Singhi Park Durga Puja");
            southrating.add(3);
            southPandles.add(new LatLng(22.521248, 88.366541));
            PandleNames.add("Ekdalia Evergreen Club");
            southrating.add(3);
            southPandles.add(new LatLng(22.526290, 88.354674));
            PandleNames.add("Maddox Square Park");
            southrating.add(4);
            southPandles.add(new LatLng(22.522273, 88.365858));
            PandleNames.add("Falguni Sangha");
            southrating.add(2);


            PandleNames.add("Bhowanipur 75 Palli");
            southPandles.add(new LatLng(22.533261, 88.345713));
            southrating.add(4);

            PandleNames.add("Bhowanipur Swadhin Sangha Durga Puja");
            southPandles.add(new LatLng(22.531984, 88.346484));
            southrating.add(4);

            PandleNames.add("68 pally Durga Puja");
            southPandles.add(new LatLng(22.528797, 88.346331));
            southrating.add(4);

            PandleNames.add("Aikatan, Dakshin Kolkata Sarbajanin Durgapujo");
            southPandles.add(new LatLng(22.527791, 88.347474));
            southrating.add(4);

            PandleNames.add("Abasar Durga Pujo");
            southPandles.add(new LatLng(22.527695, 88.349034));
            southrating.add(5);

            PandleNames.add("Babubagan Durgostav");
            southPandles.add(new LatLng(22.508512, 88.369752));
            southrating.add(4);

            PandleNames.add("Selimpur Pally Durga Puja Pandal");
            southPandles.add(new LatLng(22.504897, 88.367851));
            southrating.add(5);

            PandleNames.add("Jodhpur Park Durga Puja");
            southPandles.add(new LatLng(22.504491, 88.365529));
            southrating.add(4);

            PandleNames.add("95 pally");
            southPandles.add(new LatLng(22.508383, 88.362919));
            southrating.add(5);

            PandleNames.add("Vivekananda Sporting Club");
            southPandles.add(new LatLng(22.476352, 88.338578));
            southrating.add(4);

            PandleNames.add("Ajay Sanhati Pujo");
            southPandles.add(new LatLng(22.480868, 88.337543));
            southrating.add(4);

            PandleNames.add("Babubagan Durgostav");
            southPandles.add(new LatLng(22.508512, 88.369752));
            southrating.add(4);

            PandleNames.add("Barisha Udayan Pally");
            southPandles.add(new LatLng(22.475475, 88.309204));
            southrating.add(4);

            PandleNames.add("Barisha Sabujsathi Club");
            southPandles.add(new LatLng(22.478293, 88.311409));
            southrating.add(5);

            PandleNames.add("Barisha Club Durga Puja");
            southPandles.add(new LatLng(22.481307, 88.313208));
            southrating.add(4);

            PandleNames.add("Barisha Netaji Sangha");
            southPandles.add(new LatLng(22.486019, 88.315172));
            southrating.add(4);

            PandleNames.add("Barisha Janakalyan Sangha Durga Puja");
            southPandles.add(new LatLng(22.485150, 88.312673));
            southrating.add(3);

            PandleNames.add("Mudiali");
            southPandles.add(new LatLng(22.510015, 88.346794));
            southrating.add(5);

            PandleNames.add("Barisha Yubak Brinda Club");
            southPandles.add(new LatLng(22.486086, 88.312055));
            southrating.add(4);

            PandleNames.add("Acharya Prafulla Sangha");
            southPandles.add(new LatLng(22.490941, 88.313277));
            southrating.add(3);

            PandleNames.add("Behala Sree Sangha");
            southPandles.add(new LatLng(22.497937, 88.320150));
            southrating.add(4);

            PandleNames.add("Sonar Durga Bari");
            southPandles.add(new LatLng(22.499837, 88.314593));
            southrating.add(5);

            PandleNames.add("Behala Nutan Sangha Puja");
            southPandles.add(new LatLng(22.502027, 88.319339));
            southrating.add(4);

            PandleNames.add("Behala Debdaru Fatak Club");
            southPandles.add(new LatLng(22.502413, 88.317782));
            southrating.add(4);

            PandleNames.add("Mukul Sangha Club");
            southPandles.add(new LatLng(22.503874, 88.313518));
            southrating.add(4);

            PandleNames.add("Behala Club Sarbojanin Durgotsav");
            southPandles.add(new LatLng(22.505149, 88.314105));
            southrating.add(4);

            PandleNames.add("Naskarpur Sarbojanin");
            southPandles.add(new LatLng(22.506556, 88.312034));
            southrating.add(3);

            PandleNames.add("Behala 29 Palli");
            southPandles.add(new LatLng(22.507112, 88.322907));
            southrating.add(4);

            PandleNames.add("Behala Young Mens Association");
            southPandles.add(new LatLng(22.506948, 88.324870));
            southrating.add(3);

            PandleNames.add("Behala Buroshibtala Janakalyan Sangha");
            southPandles.add(new LatLng(22.502519, 88.332437));
            southrating.add(4);

            PandleNames.add("Behala Adarsha Pally");
            southPandles.add(new LatLng(22.499940, 88.327589));
            southrating.add(4);

            PandleNames.add("Prasanta Disha Sarbojanin");
            southPandles.add(new LatLng(22.499286, 88.327664));
            southrating.add(3);

            PandleNames.add("Barisha Tarun Tirtha Club");
            southPandles.add(new LatLng(22.484506, 88.319274));
            southrating.add(4);

            PandleNames.add("New Alipore Childrens Park");
            southPandles.add(new LatLng(22.507242, 88.337014));
            southrating.add(3);

            PandleNames.add("Ballygunge Purba Pally");
            southPandles.add(new LatLng(22.522067, 88.371223));
            southrating.add(4);

            PandleNames.add("Durgabari Prathistan Club");
            southPandles.add(new LatLng(22.525413, 88.369705));
            southrating.add(3);
        }
        return PandleNames;
    }

    public static void addSouthPandles(GoogleMap mMap) {
        setSouthPandles();
        int i = 0;
        for (LatLng latLng : southPandles) {
            if (southrating.get(i)==5) {
                mMap.addMarker(new MarkerOptions().position(latLng).title(PandleNames.get(i))).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
            }
            else if (southrating.get(i)==4) {
                mMap.addMarker(new MarkerOptions().position(latLng).title(PandleNames.get(i))).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
            }
            else if (southrating.get(i)==3) {
                mMap.addMarker(new MarkerOptions().position(latLng).title(PandleNames.get(i))).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
            }
            else if (southrating.get(i)==2) {
                mMap.addMarker(new MarkerOptions().position(latLng).title(PandleNames.get(i))).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
            }
            i++;
        }
    }

    static public ArrayList<LatLng> northPandles = new ArrayList<>();
    static public ArrayList<Integer> northrating = new ArrayList<>();
    static public ArrayList<String> northPandleNames = new ArrayList<>();

    public static ArrayList<String> setNorthPandles() {

        if(northPandles.size()==0) {

            northPandleNames.add("Darpanarayan Sarbojanin Durga Puja");
            northPandles.add(new LatLng(22.587337, 88.354322));
            northrating.add(4);

            northPandleNames.add("Pathuriaghata");
            northPandles.add(new LatLng(22.589350, 88.355595));
            northrating.add(3);

            northPandleNames.add("Ahiritola Sarbojanin Durgotsab");
            northPandles.add(new LatLng(22.594928, 88.357166));
            northrating.add(5);

            northPandleNames.add("Beniatola Sarbojonin Durgotsab");
            northPandles.add(new LatLng(22.595851, 88.361112));
            northrating.add(4);

            northPandleNames.add("Jagat Mukherjee Park");
            northPandles.add(new LatLng(22.599525, 88.366022));
            northrating.add(4);

            northPandleNames.add("Kumortuli Park Durga Puja Pandal");
            northPandles.add(new LatLng(22.601252, 88.362646));
            northrating.add(5);

            northPandleNames.add("Baghbazar Sarbojonin Durgotsab");
            northPandles.add(new LatLng(22.604710, 88.366057));
            northrating.add(5);

            northPandleNames.add("Sikdar Bagan Sadharan Durgotsov");
            northPandles.add(new LatLng(22.596693, 88.372300));
            northrating.add(4);

            northPandleNames.add("Hatibagan Nabin Pally Durga Puja");
            northPandles.add(new LatLng(22.596002, 88.373487));
            northrating.add(5);

            northPandleNames.add("Hatibagan Sarbojanin Durgotsav");
            northPandles.add(new LatLng(22.594436, 88.371990));
            northrating.add(4);

            northPandleNames.add("Kashi Bose Lane Sarbojanin");
            northPandles.add(new LatLng(22.590967, 88.368907));
            northrating.add(5);

            northPandleNames.add("Maniktala Chalta bagan");
            northPandles.add(new LatLng(22.585195, 88.372156));
            northrating.add(5);

            northPandleNames.add("Vivekananda Sporting Club Durga Puja");
            northPandles.add(new LatLng(22.586181, 88.366846));
            northrating.add(5);

            northPandleNames.add("Simla Byayam Samity Durga Puja");
            northPandles.add(new LatLng(22.585491, 88.365022));
            northrating.add(5);

            //Route 1 ends here

            northPandleNames.add("Kankurgachi Yubak Brinda");
            northPandles.add(new LatLng(22.579576, 88.387887));
            northrating.add(4);

            northPandleNames.add("Mitali Kankurgachi Durgapuja");
            northPandles.add(new LatLng(22.580017, 88.394207));
            northrating.add(4);

            northPandleNames.add("Gurudas Park Durga Puja");
            northPandles.add(new LatLng(22.570514, 88.390296));
            northrating.add(3);

            northPandleNames.add("Beliaghata 33 Pally Adhibasibrindo Durga Puja");
            northPandles.add(new LatLng(22.568834, 88.391409));
            northrating.add(4);

            northPandleNames.add("sandhani");
            northPandles.add(new LatLng(22.565001, 88.396285));
            northrating.add(4);

            //route 2 ends here

            northPandleNames.add("Golghata");
            northPandles.add(new LatLng(22.597067, 88.399263));
            northrating.add(3);

            northPandleNames.add("Sreebhumi Durga Puja Pandal");
            northPandles.add(new LatLng(22.599059, 88.402975));
            northrating.add(4);

            northPandleNames.add("Lake Town Adhibasi Brindo Durga Puja Pandal");
            northPandles.add(new LatLng(22.604490, 88.403970));
            northrating.add(4);

            northPandleNames.add("Lake town netaji sporting");
            northPandles.add(new LatLng(22.608264, 88.400034));
            northrating.add(4);

            northPandleNames.add("Dum Dum Park Sarbojanin Durga Puja");
            northPandles.add(new LatLng(22.609496, 88.416394));
            northrating.add(5);

            northPandleNames.add("Dum Dum Park Bharat Chakra");
            northPandles.add(new LatLng(22.610339, 88.414340));
            northrating.add(5);

            northPandleNames.add("4 No Tank");
            northPandles.add(new LatLng(22.606476, 88.417826));
            northrating.add(4);

            northPandleNames.add("Dum Dum Park Yubak Brinda");
            northPandles.add(new LatLng(22.605416, 88.417874));
            northrating.add(4);

            northPandleNames.add("Dumdum Tarun Dal");
            northPandles.add(new LatLng(22.611544, 88.418625));
            northrating.add(5);

            //miscellaneous

            northPandleNames.add("Ultadanga Sangrami");
            northPandles.add(new LatLng(22.590644, 88.395091));
            northrating.add(4);

            northPandleNames.add("Ultadanga Pallyshree Durga Puja");
            northPandles.add(new LatLng(22.595899, 88.384413));
            northrating.add(4);
        }

        return northPandleNames;
    }

    public static void addNorthPandles(GoogleMap mMap) {
        setNorthPandles();
        int i = 0;
        for (LatLng latLng : northPandles) {
            if (northrating.get(i)==5) {
                mMap.addMarker(new MarkerOptions().position(latLng).title(northPandleNames.get(i))).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
            }
            else if (northrating.get(i)==4) {
                mMap.addMarker(new MarkerOptions().position(latLng).title(northPandleNames.get(i))).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
            }
            else if (northrating.get(i)==3) {
                mMap.addMarker(new MarkerOptions().position(latLng).title(northPandleNames.get(i))).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
            }
            else if (northrating.get(i)==2) {
                mMap.addMarker(new MarkerOptions().position(latLng).title(northPandleNames.get(i))).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
            }
            i++;
        }

    }


    static public ArrayList<LatLng> misPandals = new ArrayList<>();
    static public ArrayList<Integer> misratings = new ArrayList<>();
    static public ArrayList<String> misPandleNames = new ArrayList<>();

    public static ArrayList<String> setmisPandles() {
        if(misPandals.size()==0){

            misPandleNames.add("Sealdah Railway Athletic Club");
            misPandals.add(new LatLng(22.570668, 88.371912));
            misratings.add(3);

            misPandleNames.add("Ratan Ghosh's Pandal");
            misPandals.add(new LatLng(22.563476, 88.379716));
            misratings.add(3);

            misPandleNames.add("College Square Durgotsob");
            misPandals.add(new LatLng(22.574598, 88.363823));
            misratings.add(4);

            misPandleNames.add("Md Ali Park Pujo");
            misPandals.add(new LatLng(22.577258, 88.360726));
            misratings.add(3);

            misPandleNames.add("Santosh Mitra Square");
            misPandals.add(new LatLng(22.565842, 88.365546));
            misratings.add(4);
        }
        return misPandleNames;
    }
    public static void addmisPandles(GoogleMap mMap) {
        setmisPandles();
        int i = 0;
        for (LatLng latLng : misPandals) {
            if (misratings.get(i)==5) {
                mMap.addMarker(new MarkerOptions().position(latLng).title(misPandleNames.get(i))).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
            }
            else if (misratings.get(i)==4) {
                mMap.addMarker(new MarkerOptions().position(latLng).title(misPandleNames.get(i))).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
            }
            else if (misratings.get(i)==3) {
                mMap.addMarker(new MarkerOptions().position(latLng).title(misPandleNames.get(i))).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
            }
            else if (misratings.get(i)==2) {
                mMap.addMarker(new MarkerOptions().position(latLng).title(misPandleNames.get(i))).setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
            }
            i++;
        }
    }
}