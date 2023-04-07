package file.binaryfile;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AddContent extends ObjectOutputStream{

    public AddContent(OutputStream out) throws IOException {
        super(out);
    }

    public AddContent() throws IOException, SecurityException {
    }
    
    @Override
    public void writeStreamHeader() throws IOException{
        reset();
    }
}
