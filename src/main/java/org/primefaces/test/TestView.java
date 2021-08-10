package org.primefaces.test;

import lombok.Data;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Named
@ViewScoped
public class TestView implements Serializable {

    private String string;
    private Integer integer;
    private BigDecimal decimal;
    private LocalDateTime localDateTime;
    private List<Entity> dataModel;
    private Entity selection;

    @PostConstruct
    public void init() {
        string = "Welcome to PrimeFaces!!!";
    }

    public List<Entity> getModel() {
        if (dataModel == null) {
            Entity e1 = new Entity("Mats");
            Entity e2 = new Entity("Nils");

            this.dataModel = new ArrayList<>(Arrays.asList(e1, e2));
        }

        return dataModel;
    }

    public void clearSelection() {
        selection = null;
    }

    public Entity getSelection() {
        return selection;
    }

    public void setSelection(Entity selection) {
        this.selection = selection;
    }
}
