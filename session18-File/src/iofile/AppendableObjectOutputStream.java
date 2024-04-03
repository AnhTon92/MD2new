package iofile;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AppendableObjectOutputStream extends ObjectOutputStream {// L?p AppendableObjectOutputStream k? th?a t?
    // ObjectOutputStream v� ghi ?� ph??ng th?c writeStreamHeader.
    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        // Kh�ng ghi header khi append ?? tr�nh l?i khi ??c file
        reset();
    }
}
