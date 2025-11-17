# Translator

Author: Suhani Rai

## Overview

This program is a simple Spanish-to-English text translator built in Java using a HashMap for fast word lookups. It reads a dictionary file (espanol-english.dat)
containing Spanish words paired with their English translations, stores those pairs in memory, and then translates lines from an input file (translateMe.in) word by word.

___

## Features

- File-based dictionary loading using Scanner
- Efficient word translation with a HashMap<String, String>
- Line-by-line text translation from Spanish to English
- Graceful error handling for missing files (FileNotFoundException)
- Automatic printing of translated output to the console

___

## How It Works

- Load the dictionary file:
  - The program opens espanol-english.dat.
  - Each line contains two words: the Spanish word and its English translation.
  - The program splits each line at the space and stores the pair in a HashMap.
- Read the text to translate:
  - It then opens translateMe.in, which contains Spanish sentences.
  - Each line is split into individual words.
- Translate word-by-word:
  - For each word in the file, the program looks it up in the HashMap and prints the English equivalent.
  - Translated sentences are printed to the console.
- Error Handling:
  - If either file is missing, the program prints an error message and a stack trace.
