from django.shortcuts import render
from django.http import HttpResponse

def index(request):
    return HttpResponse("Hello World! Rescuers at Service!__At RescueAPI request_module index.");


