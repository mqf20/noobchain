package com.kingsland.client.commands;

import com.kingsland.blockchain.Blockchain;
import com.kingsland.blockchain.Transaction;
import com.kingsland.client.annotations.Command;

import java.util.Scanner;

@Command("add pending")
public class AddPendingCommand implements Executable {
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void execute(Blockchain blockchain) {
        System.out.print("Sender: ");
        String sender = scanner.nextLine();

        System.out.print("Recipient: ");
        String recipient = scanner.nextLine();

        System.out.print("Amount: ");
        int amount = Integer.parseInt(scanner.nextLine());

        Transaction tx = new Transaction(sender, recipient, amount);
        blockchain.addPendingTransaction(tx);

        System.out.println("Pending transaction added successfully");
    }
}
