package com.kingsland.client.commands;

import com.kingsland.blockchain.Blockchain;
import com.kingsland.client.annotations.Command;

@Command("exit")
public class ExitCommand implements Executable {
    @Override
    public void execute(Blockchain blockchain) {
        System.exit(0);
    }
}
