package com.google.mlkit.main

import android.content.Intent
import com.mlkit.example.internal.BaseEntryChoiceActivity
import com.mlkit.example.internal.Choice

class MainActivity : BaseEntryChoiceActivity() {

  override fun getChoices(): List<Choice> {
    return listOf(
      Choice(
        "Vision Quickstart",
        "Barcode, Face, Text, Object, Pose, Selfie Segmentation, Face Mesh, Subject Segmentation",
        Intent().setClassName(this, "com.google.mlkit.vision.demo.EntryChoiceActivity")
      ),
      Choice(
        "Material Showcase (Vision)",
        "Live Object Detection and Live Barcode Scanning with Material Design",
        Intent().setClassName(this, "com.google.mlkit.md.MainActivity")
      ),
      Choice(
        "Translate Showcase",
        "Camera text translation showcase with Material Design",
        Intent().setClassName(this, "com.google.mlkit.showcase.translate.MainActivity")
      ),
      Choice(
        "Digital Ink Recognition",
        "Recognize handwritten text and drawings on screen",
        Intent().setClassName(this, "com.google.mlkit.samples.vision.digitalink.recognition.DigitalInkMainActivity")
      ),
      Choice(
        "Code Scanner",
        "Scan barcodes using Google Play services Code Scanner",
        Intent().setClassName(this, "com.google.mlkit.samples.codescanner.EntryChoiceActivity")
      ),
      Choice(
        "Document Scanner",
        "Scan physical documents into PDFs or images",
        Intent().setClassName(this, "com.google.mlkit.samples.documentscanner.EntryChoiceActivity")
      ),
      Choice(
        "Entity Extraction",
        "Extract entities like dates, addresses, tracking numbers from text",
        Intent().setClassName(this, "com.google.mlkit.samples.nl.entityextraction.EntryChoiceActivity")
      ),
      Choice(
        "Language ID",
        "Identify the language of a text snippet",
        Intent().setClassName(this, "com.google.mlkit.samples.nl.languageid.EntryChoiceActivity")
      ),
      Choice(
        "Smart Reply",
        "Generate context-relevant replies to messages",
        Intent().setClassName(this, "com.google.mlkit.samples.nl.smartreply.EntryChoiceActivity")
      ),
      Choice(
        "Translate",
        "On-device language translation",
        Intent().setClassName(this, "com.google.mlkit.samples.nl.translate.EntryChoiceActivity")
      ),
      Choice(
        "AutoML Vision Edge",
        "Object detection with custom AutoML models",
        Intent().setClassName(this, "com.google.mlkit.codelab.objectdetection.ChoiceActivity")
      ),
      Choice(
        "GenAI Demos",
        "Summarization, Rewriting, Proofreading, Image Description, Open Prompt",
        Intent().setClassName(this, "com.google.mlkit.genai.demo.EntryChoiceActivity")
      ),
      Choice(
        "Speech Recognition Demo",
        "On-device speech recognition demo",
        Intent().setClassName(this, "com.google.mlkit.genai.speech.demo.SpeechRecognitionActivity")
      ),
      Choice(
        "Android Snippets",
        "Code snippets demonstrating ML Kit APIs",
        Intent().setClassName(this, "com.google.example.mlkit.MainActivity")
      )
    )
  }
}
