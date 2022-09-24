# Android_Contact_App_UI
Simple UI of Contact App using guidelines and RecyclerView &amp; Custom Adapter

This topic is a part of [My Complete Andorid Course](https://github.com/ananddasani/Android_Apps)

# Code

#### MainActivity.java
```
    Contact c1 = new Contact(1, "9426285563", "Anand");
    Contact c2 = new Contact(2, "9426285563", "Aryan");
    Contact c3 = new Contact(3, "9426285563", "Chinmay");
    Contact c4 = new Contact(4, "9426285563", "Chintan");
    Contact c5 = new Contact(5, "9426285563", "Chirag");
    Contact c6 = new Contact(6, "9426285563", "Deep");
    Contact c7 = new Contact(7, "9426285563", "Jay");
    Contact c8 = new Contact(8, "9426285563", "Jayesh");
    Contact c9 = new Contact(9, "9426285563", "Mayur");
    Contact c10 = new Contact(10, "9426285563", "Ria");
    Contact c11 = new Contact(11, "9426285563", "Rucha");
    
    Contact[] contacts = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11};
    
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        CustomAdapter c = new CustomAdapter(contacts);
        recyclerView.setAdapter(c);

        //Add dividers
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

```

#### CustomAdapter.java
```
package com.example.contactappui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private Contact[] localDataSet;

    TextView textView1;
    TextView textView2;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private final TextView textView2;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            textView = (TextView) view.findViewById(R.id.textView);
            textView2 = (TextView) view.findViewById(R.id.textView2);
        }

        public TextView getTextView() {
            return textView;
        }
    }


    //1. Initialize the dataset of the Adapter (constructor)
    public CustomAdapter(Contact[] dataSet) {
        localDataSet = dataSet;
    }

    //2. Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {


        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.contact_layout, viewGroup, false);

        textView1 = view.findViewById(R.id.textView);
        textView2 = view.findViewById(R.id.textView2);

        return new ViewHolder(view);
    }

    //3. Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element

        textView1.setText(localDataSet[position].name);
        textView2.setText(localDataSet[position].phoneNumber);
    }

    //4. Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return localDataSet.length;
    }
}
```

#### Contact.java
```
package com.example.contactappui;

public class Contact {

    public int sno;
    public String phoneNumber;
    public String name;

    public Contact(int sno, String phoneNumber, String name) {
        this.sno = sno;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }
}
```

# App Highlight

<img src="app_images/Contact UI Code.png" width="1000" /><br>

<img src="app_images/Contact UI App.png" width="300" /><br>
