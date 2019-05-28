package com.kingsland.client.commands;

import com.kingsland.blockchain.Blockchain;

public interface Executable {
    void execute(Blockchain blockchain);
}
