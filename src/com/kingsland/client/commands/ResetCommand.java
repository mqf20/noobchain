package com.kingsland.client.commands;

import com.kingsland.blockchain.Blockchain;
import com.kingsland.client.annotations.Command;

@Command("reset")
public class ResetCommand implements Executable {
    @Override
    public void execute(Blockchain blockchain) {
        blockchain.reset();
    }
}
