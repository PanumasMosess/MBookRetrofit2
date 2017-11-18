package com.juck.jxk.mbookretrofit2;

import android.app.ProgressDialog;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import com.juck.jxk.mbookretrofit2.api.RetrofitService;
import com.juck.jxk.mbookretrofit2.api.apiService;
import com.juck.jxk.mbookretrofit2.model.Book;
import com.juck.jxk.mbookretrofit2.model.DataManager;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private View parentView;
    private GridView gridView;
    private List<Book> bookList;
    private BookAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Array List for Binding Data from JSON to this List
         */
        bookList  = new ArrayList<>();
        gridView = (GridView)findViewById(R.id.gridViewList);

        final ProgressDialog dialog;
        /**
         * Progress Dialog for User Interaction
         */
        dialog = new ProgressDialog(MainActivity.this);
        dialog.setTitle(getString(R.string.string_getting_json_title));
        dialog.setMessage(getString(R.string.string_getting_json_message));
        dialog.show();

        apiService api = RetrofitService.getMyJSON();
        /**
         * Calling JSON
         */
        Call<DataManager> call = api.getMyJSON();

        call.enqueue(new Callback<DataManager>() {
            @Override
            public void onResponse(Call<DataManager> call, Response<DataManager> response) {
                //Dismiss Dialog
                dialog.dismiss();

                if(response.isSuccessful()) {
                    /**
                     * Got Successfully
                     */
                    bookList  = response.body().getData().getBook();

                    /**
                     * Binding that List to Adapter
                     */
                    adapter = new BookAdapter(MainActivity.this, bookList);
                    gridView.setAdapter(adapter);
                    gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            System.out.println("Test Click");
                        }
                    });

                } else {
                    Snackbar.make(parentView, R.string.string_some_thing_wrong, Snackbar.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<DataManager> call, Throwable t) {
                dialog.dismiss();
                System.out.println("Failed");
            }
        });

    }
}
