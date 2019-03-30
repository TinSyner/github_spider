## Altman3

[![Altman version][altman-image]][altman-url]
[![.net required version][.net-image]][.net-url]
[![mono required version][mono-image]][mono-url]
[![gtksharp required version][gtksharp-image]][gtksharp-url]

[��������][altman-forums-url] | [�ٷ���ҳ][altman-website-url] | [Readme in English ][readme-en-url]

> �������������������ѧϰ���о���
> ��ʹ�������ع�����ط��ɷ��棡
> ����ʹ�ò�����ɵĺ�����˲��е��κ����Σ�

### ����
**Altman3** ��һ����͸�����������վ�й���`Github Pages`��

����Ŀǰ�������ԣ�

- Webshellģ�飺����xml����ķ�ʽ�����Զ���ű����ͺͽű����ܣ��Զ������/����
	- Shell������
	- ����ִ�в��
	- �ļ�������
	- ���ݿ������
	- ֧�ֵĽű������У�asp��aspx��php��jspFull��python
- ���������
- IP��ַ��ѯ���
- �����������
- �Զ�������֧��ʹ��`C#`����`IronPython`����д������߷���
- ���������ƣ�������Ե�����������ṩ�ķ���

### ����
1. �½�`Build`,  `Build\Bin`,  `Build\Plugins`, `Build\Services`Ŀ¼
2. ����`Resources\RunNeed`Ŀ¼�µ������ļ���`Build`Ŀ¼
3. ����`Libraries\IronPython`Ŀ¼�������ļ���`Build\Bin`Ŀ¼����������Ѿ���װIronPython���������˲��裩
4. ����`Libraries\Sqlite3`Ŀ¼�������ļ���`Build`Ŀ¼
5. ʹ��`VS2012`�������ϰ汾������`MonoDevelop`���б���
6. **���������Linux����Mac**�����ڱ�������ʱ����ܻᱨ��
  ����linux����mac�²�����windows�������
  - ����Խ�`*.csproj`�ļ��е�`copy`��Ϊ`cp`��`call`��Ϊ`sh`��Ȼ�����±���
  - ������Ҳ���Ժ�����������ֶ�������õĲ��dll���Ƶ�`Plugins`Ŀ¼�£�·�����������`Plugins\ShellCmder\ShellCmder.dll`
7. **�����Ҫ�����Mac�汾**������Debug������ǰ����Ҫ�ֶ���`Build`Ŀ¼�������ļ�����`Altman.Mac`�ļ������Ƶ�`Build\Altman.Mac\Contents\MonoBundle`Ŀ¼��


#### examples

##### Windows(cygwin reference to the following)

```sh
git clone https://github.com/keepwn/Altman.git
cd Altman/
# run  batch-on-windows.bat
# Use VS2012 (or the latest version) to compile Altman
```

##### Linux
> Installation mono environment: <br/>
> Ubuntu or Debian <br/>
> `sudo apt-get install mono-devel mono-complete monodevelop` <br/>
> Other linux : <<http://www.mono-project.com/download/>>

```sh
git clone https://github.com/keepwn/Altman.git
cd Altman/
./batch-on-linux.sh
monodevelop Source/SecurityTools.sln  
# Use monodevelop to compile Altman
```

##### Mac

```sh
git clone https://github.com/keepwn/Altman.git
cd Altman/
./batch-on-mac-beforeBuild.sh
# Use monodevelop compile Altman
# After build success
./batch-on-mac-afterBuild.sh
```

**Compiled output:**
- Altman/Build/Altman.Gtk.exe (gtk)
- Altman/Build/Altman.WinForm.exe (windows)
- Altman/Build/Altman.Mac (mac)



### ����
**Altman3** ����`.Net4.0`������[Eto.Form][eto-url]��������������`Windows`��`Linux`��`Mac`�ȶ��ƽ̨��

- ��`Windows`�£�
	- ˫������`Altman.Winform.exe`����Ҫ��װ`.Net4.0`
	- ˫������`Altman.Gtk.exe`����Ҫ��װ`.Net4.0`��[gtk-sharp2][gtksharp-win-url]
- ��`Linux`�£�
	- ������������`mono Altman.Gtk.exe`����Ҫ��װ`Mono`��`libgdiplus`��[gtk-sharp2][gtksharp-url]
- ��`OS X`�£�
	- ������������`mono Altman.Gtk.exe`����Ҫ��װ`Mono`��[gtk-sharp2][gtksharp-url]
	- ˫������`Altman.Mac`����Ҫ��װ`Mono`
- [**��θ��򵥵İ�װmono����**][mono-install-url]
- �����Ҫ����`IronPython`֧�֣�����Ҫ��װ[IronPython][ironpython-url]����������Ѿ��Դ�`IronPython`������Ҫ���ⰲװ��
- �������������[FAQ][faq-url]

### ���
**Altman3**������MEF����ܹ���ͬʱ֧��`IronPython`��

- ����`C#`��д���/����
- ����`IronPython`��д���/����

**����[wiki][wiki-url]����ȡ���ڲ���������ĵ�**

### ��Ȩ
������ʹ�õ���GPLv2Э�飬����ϸ������ո�Ŀ¼�µ�[LICENSE](LICENSE)�ļ���

### �Ľ�������

[�ύ����][issues-url] OR [�Ľ�����][pulls-url]

��Ҳ����ѡ����뼼������Ⱥ: 331451473

[altman-image]: https://img.shields.io/badge/Release-v3.0.1-brightgreen.svg
[altman-url]: https://github.com/keepwn/Altman
[.net-image]: https://img.shields.io/badge/.Net-4.0-blue.svg
[.net-url]: http://www.microsoft.com/zh-cn/download/details.aspx?id=17718
[mono-image]: https://img.shields.io/badge/Mono-v3.2.6+-blue.svg
[mono-url]: http://www.mono-project.com/
[gtksharp-image]: https://img.shields.io/badge/Gtksharp-v2.0+-blue.svg
[gtksharp-url]: https://github.com/mono/gtk-sharp/
[altman-forums-url]: https://groups.google.com/forum/#!forum/altman-tool
[altman-website-url]: http://altman.keepwn.com
[readme-en-url]: README.md
[eto-url]: https://github.com/picoe/Eto
[gtksharp-win-url]: http://download.xamarin.com/GTKforWindows/Windows/gtk-sharp-2.12.25.msi
[mono-install-url]: http://www.mono-project.com/download/
[ironpython-url]: http://ironpython.codeplex.com/
[faq-url]: https://github.com/keepwn/Altman/wiki/FAQ
[wiki-url]: https://github.com/keepwn/Altman/wiki
[issues-url]: https://github.com/keepwn/Altman/issues
[pulls-url]: https://github.com/keepwn/Altman/pulls
