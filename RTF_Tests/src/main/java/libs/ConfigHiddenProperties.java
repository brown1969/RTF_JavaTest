package libs;

import org.aeonbits.owner.Config;

@Config.Sources(value = "file:C:\\Java_Workspace\\RTF_proj\\RTF_Tests\\src\\main\\resources\\hiddenConfig.properties")
public interface ConfigHiddenProperties extends Config{
    String login();
    String password();
}
