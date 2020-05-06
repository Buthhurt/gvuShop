package by.gvu.jd2.mysql;

import by.gvu.jd2.service.ErrorCommand;
import by.gvu.jd2.service.LoginCommand;
import by.gvu.jd2.service.RegistrationCommand;
import by.gvu.jd2.service.base.Command;

public final class FactoryCommand {
    public static Command getCommand(String commandName){
        if (commandName != null && commandName.equals("registration"))
            return new RegistrationCommand();
        else if (commandName != null && commandName.equals("login"))
            return new LoginCommand();

        return new ErrorCommand();
    }
}
