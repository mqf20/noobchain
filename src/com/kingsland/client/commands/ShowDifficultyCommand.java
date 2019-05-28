package com.kingsland.client.commands;

import com.kingsland.blockchain.Blockchain;
import com.kingsland.client.annotations.Command;

@Command("show difficulty")
public class ShowDifficultyCommand implements Executable {
    @Override
    public void execute(Blockchain blockchain) {
        System.out.println(blockchain.getDifficulty());
    }
}
