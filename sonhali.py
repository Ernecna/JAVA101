import random

print("\n----------- OYUN BAŞLADI -----------\n\n")
goal = int(input("Oyun bitim puanını belirleyiniz: "))     # Hangi puan geçildiğinde oyunun bitmesine karar verilmesi için atanan değişken.
p1 = 0                      # Oyuncu 1'in toplam puanını tutan değişken.
p2 = 0                      # Oyuncu 2'nin toplam puanını tutan değişken.
canPlayp1 = True            # Oyuncu 1'in bu el bekleyip beklemeyeceğini belirleyen değişken.
canPlayp2 = True            # Oyuncu 2'nin bu el bekleyip beklemeyeceğini belirleyen değişken.
anyWinner = False           # Kazanan var mı yok mu kontrol edilen değişken.


while True:                 # Döngü kazanan olana kadar devam edecek
    for i in range(1,3):    # İçteki for döngüsü ile oyuncular arasındaki sıra devam edecek (1. oyuncu ve 2. oyuncu).
        print("\nOyuncu", i, "adına zar atmak için enter tuşuna basın:", end=" ")
        input()             # Tuşa basılana kadar beklemek için boş bir input konuldu.

        pScore = random.randint(1, 6)            # Burada 1 ile 6 arasında rastgele bir sayı seçiliyor.
        
        if i == 1 and canPlayp1 == True:         # Eğer sıra oyuncu 1'deyse ve oynama hakkı varsa seçilen rastgele sayı oyuncu 1'e ekleniyor.
            p1 += pScore
            points = p1                          # points değişkeni ileride "ceza-ödül-bekleme" kontrol kısmında işe yarayacak.
        
        elif i == 1 and canPlayp1 == False:      # Eğer sıra oyuncu 1 de ve oynama hakkı yoksa bu turda olan for'u kırmak adına continue konuldu.
            print("Oyuncu 1 bu el beklemek zorunda\n")
            canPlayp1 = True
            continue
        
        # Bu kısım, üstteki oyuncu 1 için olanların oyuncu 2 için olan versiyonu
        elif i == 2 and canPlayp2 == True:
            p2 += pScore
            points = p2

        elif i == 2 and canPlayp2 == False:
            print("Oyuncu 2 bu el beklemek zorunda\n")
            canPlayp2 = True
            continue
    

        # Kontrollerden sonra ekrana gelen sayı bastırılıyor.
        print("Oyuncu", i, "için gelen sayı:", pScore)


        # CEZA-ÖDÜL-BEKLEME KONTROL BLOKLARI
        if points == 12:
            print("12. bölgeye ulaştınız. Ceza olarak 3 puanınız geri alınacak.")
            if i == 1:
                p1 -= 3

            else:
                p2 -= 3

        elif points == 23:
            print("23. bölgeye ulaştınız. Ödül olarak 5 puan eklenecek")
            if i == 1:
                p1 += 5

            else:
                p2 += 5

        elif points == 31:
            print("31. bölgeye ulaştınız. Ceza olarak 1 el beklemeniz gerek")
            if i == 1:
                canPlayp1 = False

            else:
                canPlayp2 = False
        
        elif points == 15:
            print("15. bölgeye ulaştınız. Ceza olarak 1 el beklemeniz gerek")
            if i == 1:
                canPlayp1 = False

            else:
                canPlayp2 = False

        elif points == 19:
            print("19. bölgeye ulaştınız. Ödül olarak 3 puan eklenecek")
            if i == 1:
                p1 += 3

            else:
                p2 += 3

        elif points == 6:
            print("6. bölgeye ulaştınız. Ceza olarak 3 puanınız geri alınacak.")
            if i == 1:
                p1 -= 3

            else:
                p2 -= 3


        # Kazanan var mı kontrol etme kısmı               
        if p1 >= goal:
                print("\n\n!!!!!OYUNCU 1 KAZANDI!!!!!")
                anyWinner = True
                break                   # Kazandıysa for döngüsü kırılsın ve anyWiner değişken true olarak atansın

        elif p2 >= goal:
                print("\n\n!!!!!OYUNCU 2 KAZANDI!!!!!")
                anyWinner = True
                break
        

    # el bittikten sonra son puanların ekrana bastırıldığı kısım
    if anyWinner == False:
        print("\n\n----------------- EL SONU -----------------")
        print("Bu el sonunda oyuncu 1 için toplam puan:", p1)
        print("Bu el sonunda oyuncu 2 için toplam puan:", p2)
        print("--------------------------------------------")


    # For döngüsü bittikten sonra herhangi bir kazanan varsa tüm while döngüsünü kırmak için bu kısmı kontrol ediliyor
    if anyWinner == True:
                print("\n\n--------OYUN SONU--------\nOyuncu 1:", p1, "\nOyuncu 2:", p2, "\n-------------------------")
                break       # Bu break ile birlikte tüm while döngüsü kırılıyor.
