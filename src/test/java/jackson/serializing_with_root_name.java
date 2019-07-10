package jackson;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.jackson.UserWithRoot;

public class serializing_with_root_name {
	@Test
	public void whenSerializingUsingJsonRootName_thenCorrect()
	  throws JsonProcessingException {
	UserWithRoot user = new UserWithRoot(1, "John");
	 
    ObjectMapper mapper = new ObjectMapper();
    mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
    String result = mapper.writeValueAsString(user);
 
    equals(result.contains("John"));
    equals(result.contains("user"));

}
}
