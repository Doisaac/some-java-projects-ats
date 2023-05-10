
package binary.athletecompetitioninbinary;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

class AddContent extends ObjectOutputStream {

    public AddContent(OutputStream out) throws IOException {
        super(out);
    }

    public AddContent() throws IOException, SecurityException {
    }
    
    @Override
    public void writeStreamHeader() throws IOException{
        File file = new File("registeredAthletes.bin");
        
        if(file.length() == 0){
            super.writeStreamHeader();
        }
        else{
            reset();
        }
    }
}
