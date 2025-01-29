package entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Builder
public class Refran {

    private Integer id;
    private String refran;

/*
    public Refran() {
    }

    public Refran(Integer id, String refran){
        this.id = id;
        this.refran = refran;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRefran() {
        return refran;
    }

    public void setRefran(String refran) {
        this.refran = refran;
    }

    @Override
    public String toString() {
        return "Refran{" +
                "id=" + id +
                ", refran='" + refran + '\'' +
                '}';
    }
*/

}
