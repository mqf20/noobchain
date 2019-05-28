package com.kingsland.client.commands;

import com.kingsland.blockchain.Blockchain;
import com.kingsland.client.annotations.Command;

@Command("")
public class EmptyCommand implements Executable {
    @Override
    public void execute(Blockchain blockchain) {
    }
}
