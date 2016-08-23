import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class DataModel {

    @NonNull
    private int id;

    @NonNull
    private String description;

}
