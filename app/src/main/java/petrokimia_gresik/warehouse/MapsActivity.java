package petrokimia_gresik.warehouse;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Urea and move the camera
        LatLng urea = new LatLng(-7.1366049, 112.6304458);
        mMap.addMarker(new MarkerOptions().position(urea).title("Gudang Urea").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(urea));

        // Add a marker in Amurea and move the camera
        LatLng amurea = new LatLng(-7.1521327, 112.6270771);
        mMap.addMarker(new MarkerOptions().position(amurea).title("Gudang Amurea").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(amurea));

        // Add a marker in PFI and move the camera
        LatLng pfi = new LatLng(-7.1535122, 112.6329061);
        mMap.addMarker(new MarkerOptions().position(pfi).title("Gudang PFI").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pfi));

        // Add a marker in GMG and move the camera
        LatLng gmg = new LatLng(-7.1467608, 112.640231);
        mMap.addMarker(new MarkerOptions().position(gmg).title("Gudang GMG").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gmg));

        // Add a marker in PFII and move the camera
        LatLng pfii = new LatLng(-7.1600306, 112.6373093);
        mMap.addMarker(new MarkerOptions().position(pfii).title("Gudang PFII").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pfii));

        // Add a marker in ZA and move the camera
        LatLng za = new LatLng(-7.1442251, 112.6567767);
        mMap.addMarker(new MarkerOptions().position(za).title("Gudang ZA").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(za));

        // Add a marker in PHONSKA and move the camera
        LatLng phonska = new LatLng(-7.139523, 112.6369348);
        mMap.addMarker(new MarkerOptions().position(phonska).title("Gudang PHONSKA").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(phonska));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(urea, 13));
    }
}
