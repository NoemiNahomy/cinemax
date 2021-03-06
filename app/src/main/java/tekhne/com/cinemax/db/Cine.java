package tekhne.com.cinemax.db;

import android.util.Log;

import org.greenrobot.greendao.annotation.*;
import org.json.JSONException;
import org.json.JSONObject;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "CINE".
 */
@Entity
public class Cine {

    @Id
    private Long id;

    @NotNull
    private String nombre;

    @NotNull
    private String direccion;

    @Generated(hash = 946205212)
    public Cine() {
    }

    public Cine(Long id) {
        this.id = id;
    }

    @Generated(hash = 1958014616)
    public Cine(Long id, @NotNull String nombre, @NotNull String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    public String getNombre() {
        return nombre;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setNombre(@NotNull String nombre) {
        this.nombre = nombre;
    }

    @NotNull
    public String getDireccion() {
        return direccion;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setDireccion(@NotNull String direccion) {
        this.direccion = direccion;
    }

    public Cine(JSONObject object){
        try {
            this.nombre = object.getString("nombre");
            this.direccion = object.getString("address");
        } catch (JSONException e) {
            Log.d("tojson", e.getMessage());
        }
    }

}

