package commands;

import client.ClientInterface;
import client.RestClientLibrary;

public interface ClientCommand {
    ClientInterface client = new RestClientLibrary();
    void execute();
}
