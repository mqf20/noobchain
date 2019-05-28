package com.kingsland.client.commands;

import com.kingsland.blockchain.Blockchain;
import com.kingsland.client.annotations.Command;

@Command("decrease difficulty")
public class DecreaseDifficultyCommand implements Executable {
    @Override
    public void execute(Blockchain blockchain) {
        blockchain.setDifficulty(blockchain.getDifficulty() - 1);
        System.out.printf("Blockchain difficulty decreased. Difficulty is now %d\n",
                blockchain.getDifficulty());
    }
}
