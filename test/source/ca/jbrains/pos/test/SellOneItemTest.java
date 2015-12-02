package ca.jbrains.pos.test;

import org.junit.Assert;
import org.junit.Test;

public class SellOneItemTest {
    @Test
    public void productFound() throws Exception {
        final Display display = new Display();
        final Sale sale = new Sale(display);

        sale.onBarcode("12345");

        Assert.assertEquals("EUR 7.95", display.getText());
    }

    public static class Sale {
        private Display display;

        public Sale(Display display) {
            this.display = display;
        }

        public void onBarcode(String barcode) {
            display.setText("EUR 7.95");
        }
    }
    public static class Display {
        private String text;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}
