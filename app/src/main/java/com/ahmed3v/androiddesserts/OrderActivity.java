package com.ahmed3v.androiddesserts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    private EditText nameEditText, addressEditText, phoneEditText, noteEditText;
    private RadioButton standerDeliveryButton, fastDeliveryButton, pickUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        nameEditText = findViewById(R.id.name_edit_text);
        addressEditText = findViewById(R.id.address_edit_text);
        phoneEditText = findViewById(R.id.phone_edit_text);
        noteEditText = findViewById(R.id.note_edit_text);

        standerDeliveryButton = findViewById(R.id.standard_delivery_radio_btn);
        fastDeliveryButton = findViewById(R.id.fast_delivery_radio_btn);
        pickUpButton = findViewById(R.id.pickup_radio_btn);

        spinner = findViewById(R.id.spinner);

        if(spinner != null) {

            spinner.setOnItemSelectedListener(this);
        }

        // Create ArrayAdapter using the string array and default spinner layout.
        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(this ,
                R.array.spinner_array , android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner.
        if(spinner != null) {
            spinner.setAdapter(adapter);
        }
    }


    public void onRadioButtonClicked(View view) {

        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked.
        switch(view.getId()) {

            case R.id.standard_delivery_radio_btn:
                if(checked) {
                    Toast.makeText(this , R.string.standard_delivery_toast , Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.fast_delivery_radio_btn:
                if(checked) {
                    Toast.makeText(this , R.string.fast_delivery_toast , Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.pickup_radio_btn:
                if(checked) {
                    Toast.makeText(this , R.string.pick_up_toast , Toast.LENGTH_SHORT).show();
                }
                break;

            default:
                // Do nothing.
                break;
        }
    }

    // Interface callback for when any spinner item is selected.
    @Override
    public void onItemSelected(AdapterView <?> adapterView , View view , int position , long id) {

        String spinnerLabel = adapterView.getItemAtPosition(position).toString();

        Toast.makeText(this , spinnerLabel, Toast.LENGTH_SHORT).show();

    }

    // Interface callback for when no spinner item is selected.
    @Override
    public void onNothingSelected(AdapterView <?> parent) {
        //Do nothing
    }
}