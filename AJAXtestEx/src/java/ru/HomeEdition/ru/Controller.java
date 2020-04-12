
package ru.HomeEdition.ru;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named
@RequestScoped
public class Controller {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text.toUpperCase();
    }
}
