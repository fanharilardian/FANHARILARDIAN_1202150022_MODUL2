package android.example.com.FANHARILARDIAN_1202150022_MODUL2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Fanharil Ardian on 18/02/2018.
 */

public class MyAdapter extends  RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<String> DataRV,HargaRV;
    private ArrayList<Integer> GambarRV;

    public MyAdapter(ArrayList<String> inputData, ArrayList<String> dataHarga, ArrayList<Integer> gambar) {
        DataRV = inputData;
        HargaRV = dataHarga;
        GambarRV = gambar;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Membuat variabel TextView, ImageView dan RelativeLayout
        public TextView namaMenu, harga;
        public ImageView gbrMenu;
        private RelativeLayout ItemList;

        private Context context;

        public ViewHolder(View v) {
            super(v);

            //Untuk Menghubungkan dan Mendapakan Context dari MainActivity
            context = itemView.getContext();

            //deklarasi TextView, ImageView dan LinearLayoout
            namaMenu = (TextView) v.findViewById(R.id.namaMenu);
            harga = (TextView) v.findViewById(R.id.harga);
            gbrMenu = (ImageView) v.findViewById(R.id.gbr);
            ItemList = v.findViewById(R.id.list);

            // isi array berpindah dengan yang sudah ditetapkan
            // kalau List terpilih / di tap
            ItemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Kalau di tap listnya, arahkan ke kelas DetailMenu
                    Intent intent = new Intent(context,DetailMenu.class);
                    String ingredient ="";
                    // berikondisi setiap list pada DetailMenu
                    switch (getAdapterPosition()){
                        case 0 :
                            // Ayam Geprek
                            intent.putExtra("Nama Menu",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",HargaRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            ingredient = "Ayam, Sambal Geprek, Timun, Sayur";
                            intent.putExtra("Komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 1 :
                            // Ayam Goreng
                            intent.putExtra("Nama Menu",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",HargaRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            ingredient = "Daging ayam yang digoreng pake garem";
                            intent.putExtra("Komposisi",ingredient);
                            context.startActivity(intent);
                            break;

                        case 2 :
                            // Gulai Ayam
                            intent.putExtra("Nama Menu",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",HargaRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            ingredient = "Daging Ayam, Tomat, Kuah Gulainya";
                            intent.putExtra("Komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 3 :
                            // Gulai Sapi
                            intent.putExtra("Nama Menu",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",HargaRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            ingredient = "Daging Sapi, Tomat, Kuah Gulainya";
                            intent.putExtra("Komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 4 :
                            // Lele Goreng
                            intent.putExtra("Nama Menu",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",HargaRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            ingredient = "Ikan Lele, Garam, Mentimun, Kol";
                            intent.putExtra("Komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 5 :
                            // Nasi Goreng Ayam
                            intent.putExtra("Nama Menu",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",HargaRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            ingredient = "Daging Ayam, Nasi, Garam, Wortel, Kerupuk";
                            intent.putExtra("Komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 6 :
                            // Nasi Goreng Kambing
                            intent.putExtra("Nama Menu",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",HargaRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            ingredient = "Daging Kambing, Nasi, Garam, Wortel, Kerupuk";
                            intent.putExtra("Komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 7 :
                            // Pecel Lele
                            intent.putExtra("Nama Menu",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",HargaRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            ingredient = "Ikan Lele Segar, Kol, Kemangi, Sambal Matah";
                            intent.putExtra("Komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 8 :
                            // Sate Ayam
                            intent.putExtra("Nama Menu",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",HargaRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            ingredient = "Daging Ayam, Tusuk Sate, Garam, Sambal";
                            intent.putExtra("Komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 9 :
                            // Sop Ayam
                            intent.putExtra("Nama Menu",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",HargaRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            ingredient = "Ayam Pilihan, Kentang, Tomat, Wortel, Seledri";
                            intent.putExtra("Komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 10 :
                            // Telur Dadar
                            intent.putExtra("Nama Menu",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",HargaRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            ingredient = "Telur Dadar tok";
                            intent.putExtra("Komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 11 :
                            // Tempoyak
                            intent.putExtra("Nama Menu",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",HargaRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            ingredient = "Kuah Durian, Ikan Patin, Timun";
                            intent.putExtra("Komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                    }

                }
            });
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // membuat view baru
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_menu, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        // get data dari posisi dalam recycler view tertentu
        final String name = DataRV.get(position);
        final String harga = HargaRV.get(position);
        final Integer test = GambarRV.get(position);

        // atur nilai view holder tersebut
        holder.namaMenu.setText(name);
        holder.harga.setText(harga);
        holder.gbrMenu.setImageResource(test);

    }

    @Override
    public int getItemCount() {
        // menampilkan ukuran data dalam recyclerview
        return DataRV.size();
    }
}

