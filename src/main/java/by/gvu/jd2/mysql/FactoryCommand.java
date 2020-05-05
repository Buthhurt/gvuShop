package by.gvu.jd2.mysql;

import by.gvu.jd2.service.command.ErrorCommand;
import by.gvu.jd2.service.command.RegistrationCommand;
import by.gvu.jd2.service.command.base.Command;

public final class FactoryCommand {
    public static Command getCommand(String commandName){
        if (commandName != null && commandName.equals("registration"))
            return new RegistrationCommand();

        return new ErrorCommand();
    }
}
